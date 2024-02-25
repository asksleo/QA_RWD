package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class PageElement {
    protected Logger logger = LoggerFactory.getLogger(getClass().getSimpleName());
    protected String elementIdentifier = null;
    protected int iFrameIdentifier = -1;

    public PageElement(String elementIdentifier) {
        this.elementIdentifier = elementIdentifier;
        iFrameIdentifier = -1;
    }

    public PageElement(String elementIdentifier, int iFrameIdentifier) {
        this(elementIdentifier);
        this.iFrameIdentifier = iFrameIdentifier;
    }

    // attempt to find the web element via the most commen methods
    public WebElement getWebElement() {
        WebElement element = null;
        logger.info("find element: " + elementIdentifier);

     BrowserSession.driver.switchTo().window(BrowserSession.driver.getWindowHandle());
        if (iFrameIdentifier != -1) {
            BrowserSession.driver.switchTo().defaultContent();
            BrowserSession.driver.switchTo().frame(iFrameIdentifier);
        }

        // try to find element right off the bat
        element = getWebElementInternal();
        if (element != null) {
            return element;
        }

        // if that didn't work, wait for the element
        new WebDriverWait(BrowserSession.driver, Duration.ofSeconds(5)).until(webDriver -> {
            logger.info("wait for element: " + elementIdentifier);
            return getWebElementInternal() != null;
        });

        // at this point we should be able to get the elent
        return getWebElementInternal();
    }

    // attempt to find the web element via the most commen methods
    public WebElement getWebElementInternal() {
        WebElement element = null;

        // id
        if (elementIdentifier.indexOf("#") == 0) {
            try {
                element = BrowserSession.driver.findElement(By.id(elementIdentifier.substring(1)));
            } catch (Exception e) {
                // do nothing
            }
        }

        // class
        else if (elementIdentifier.indexOf(".") == 0) {
            try {
                element = BrowserSession.driver.findElement(By.className(elementIdentifier.substring(1)));
            } catch (Exception e) {
                // do nothing
            }
        }

        // xpath
        else if (elementIdentifier.indexOf("//") == 0) {
            try {
                element = BrowserSession.driver.findElement(By.xpath(elementIdentifier));
            } catch (Exception e) {
                // do nothing
            }
        }

        // we don't know what it is, try everything
        else {
            try {
                element = BrowserSession.driver.findElement(By.id(elementIdentifier));
            } catch (Exception e1) {
                try {
                    element = BrowserSession.driver.findElement(By.name(elementIdentifier));
                } catch (Exception e2) {
                    try {
                        element = BrowserSession.driver.findElement(By.xpath(elementIdentifier));
                    } catch (Exception e3) {
                        try {
                            element = BrowserSession.driver.findElement(By.className(elementIdentifier));
                        } catch (Exception e4) {
                            // do nothing
                        }
                    }
                }
            }
        }
        return element;
    }

    //check if an element exists
    protected boolean elementExistsByType(WebDriver driver, By selector) {
        try {
            //check if the element exists and is enabled
            return driver.findElement(selector).isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean exists() {
        try {
            getWebElement();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitUntilReady() {
        try {
            new WebDriverWait(BrowserSession.driver, Duration.ofSeconds(5)).until(webDriver -> {
                logger.info("wait until available: " + elementIdentifier);
                WebElement element = getWebElementInternal();
                return (element != null && element.isEnabled() && element.isDisplayed());
            });
        } catch (Exception e) {
            logger.warn("Waiting for " + elementIdentifier + " failed! Continuing on, and hoping for the best...");
        }
    }

    public boolean isVisibleOnPage() {
        WebElement element = getWebElementInternal();
        if (element == null) {
            return false;
        }
        return element.isDisplayed();
    }

    // retry some action a few times before failing
    private void retry(Runnable func) {
        int maxCount = 10;
        int delay = 1000;

        for (int count = 0; count <= maxCount; count++) {
            try {
                func.run();
                break;
            } catch (Exception e) {
                logger.info("retry " + count + "/" + maxCount);
                if (count == maxCount) {
                    throw (e);
                } else {
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException ie) {
                        logger.error("error sleeping " + ie.getMessage());
                    }
                }
            }
        }
    }

    public void click() {
        logger.info("click: " + elementIdentifier);
        retry(() -> {
            getWebElement().click();
        });
    }

    public void hoverOver() {

        Actions action = new Actions(BrowserSession.driver);
        action.sendKeys(Keys.ENTER);
        //action.moveToElement(getWebElement()).perform();
    }

    /*Mouse hoverover method with webelement paramter  to hoverover the pointer or focus on webelement.*/
    public void hoverOver(WebElement element) {
        Actions action = new Actions(BrowserSession.driver);
        action.moveToElement(element).click().perform();
    }

    public void focusOut() {
        Actions action = new Actions(BrowserSession.driver);
        action.sendKeys(Keys.TAB);
    }

    public String getHTML() {
        return (String) ((JavascriptExecutor) BrowserSession.driver)
                .executeScript("return arguments[0].innerHTML;", getWebElement());
    }

    public String getElementIdentifier() {
        return elementIdentifier;
    }

    public String getText() {
        return getWebElement().getAttribute("value");
    }

    public boolean hasClass(String className) {
        return getWebElement().isSelected();
    }

    public boolean isClickableOnPage() {
        try {
            return getWebElement().isEnabled();
        }
        //if an error is thrown, element was not found
        catch (Exception e) {
            return false;
        }
    }

    public void waitForDocumentReady() {
        try {
            new WebDriverWait(BrowserSession.driver, Duration.ofSeconds(5)).until(webDriver -> {
                logger.info("wait for document ready");
                return BrowserState.isPageReady();
            });
        }
        catch (Exception e) {
            logger.warn("Waiting for document ready failed! Continuing on, and hoping for the best...");
        }
    }

}

