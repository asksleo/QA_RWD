package PageObjects;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserState {
    public static boolean isJqueryLoaded () {
        return (boolean) getExecutor().executeScript("return !!(window.jQuery && window.loadHelpModal)");
    }

    /**
     * Check if document.ready state is 'complete'
     */
    public static boolean isPageLoaded () {
        return (boolean) getExecutor().executeScript("return document.readyState").equals("complete");
    }

    /**
     * Are all jquery calls complete
     */
    public static boolean isAjaxComplete() {
        return (boolean) getExecutor().executeScript("return !!(window.jQuery && window.jQuery.active === 0)");
    }

    /**
     * This detects a data refresh popup, and possibly some other things
     */
    public static boolean isModalOpen() {
        return (boolean) getExecutor().executeScript("return !!(window.jQuery && window.jQuery('.ui-widget-overlay').length === 0)");
    }

    /**
     * Is the page ready for us to click stuff?
     */
    public static boolean isPageReady() {
        return (boolean) getExecutor().executeScript("return !!(window.jQuery && document.readyState === 'complete');");
    }

    /**
     * Return the current url without the protocol or domain name
     */
    public static String getCurrentPath() {
        String url = StaticTestSession.browserSession.driver.getCurrentUrl();
        int protocolEndIndex = url.indexOf("://");
        int slashIndex = url.indexOf("/", protocolEndIndex + 3);
        String path = url.substring(slashIndex).trim();
        return path;
    }

    /**
     * Shortcut function to get a javascript executor
     */
    private static JavascriptExecutor getExecutor() {
        return (JavascriptExecutor) StaticTestSession.browserSession.driver;
    }

}
