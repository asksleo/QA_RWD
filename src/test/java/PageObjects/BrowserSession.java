package PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;


public class BrowserSession {

    public static WebDriver driver;
    //public ResourceBundle RB;

     public static Properties p ;
    //Java Utill Pakage



    public void open_Browser(String br) throws IOException {
     //  RB=ResourceBundle.getBundle("Config"); //Load Config.properties File

        p=getProperies();

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

        driver.get(p.getProperty("URL"));
        driver.manage().window().maximize();

    }
    public void Closing_browser() {
        driver.close();

    }
    public static Properties getProperies() throws IOException {
        System.out.println("Started");
        FileReader File = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
        System.out.println(File);
        p = new Properties();
        p.load(File);
        return p;
    }
}
