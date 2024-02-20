package PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.ResourceBundle;

public class BrowserSession {

    public WebDriver driver;
    public ResourceBundle RB; //Java Utill Pakage
    public void open_Browser(String br) {
        RB=ResourceBundle.getBundle("Config"); //Load Config.properties File

        if (br.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions Options = new ChromeOptions();
            Options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(Options);
        } else if (br.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions Options1 = new EdgeOptions();
            Options1.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(Options1);
        } else {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions Options2 = new FirefoxOptions();
            Options2.addArguments("--remote-allow-origins=*");
            driver = new FirefoxDriver(Options2);

        }

        driver.get(RB.getString("URL"));
        driver.manage().window().maximize();

    }
    public void Closing_browser() {
        driver.close();

    }

}
