package bdd.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;

    public void openBrowser() {
        Properties configs = readproperties();
        String browserType =configs.getProperty("browser");
        if(browserType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if(browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("chromeheadless")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments(" --headless");
            driver = new ChromeDriver(options);
        } else if (browserType.equalsIgnoreCase("firefoxheadless")) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments(" --headless");
            driver = new FirefoxDriver(options);
        }
        else if (browserType.equalsIgnoreCase("edgeheadless")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments(" --headless");
            driver = new EdgeDriver(options);
        }
        else {
            throw new RuntimeException("browser type is not found");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = configs.getProperty("base.url");
        driver.get(url);
    }
    private Properties readproperties(){
        String FilePath=System.getProperty("user.dir")
                +"\\src\\test\\resources\\config\\qa-env.properties";
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(FilePath);
            properties.load(inputStream);
        }catch (IOException ex){
            throw new RuntimeException("not able to read property"+ ex.getMessage()) ;
        }
        return properties;
    }
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    public WebDriver getDriver() {
        return driver;
    }
}

