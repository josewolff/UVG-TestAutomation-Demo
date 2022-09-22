package systemTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

public class InitDriver {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private String geckoDriver = "";
    private String chromeDriver = "";

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void openDriver(@Optional("chrome") String browser){
        initDriver(browser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private WebDriver initDriver(String browser) {
        try {
            selectDriverBasedOnOs();
            if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", geckoDriver);

                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } else {
                if (browser.equals("chrome")) {
                    System.setProperty("webdriver.chrome.driver", chromeDriver);
                    driver = new ChromeDriver();
                } else if (browser.equals("safari")) {
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                }
            }

            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            return driver;
        } catch (Exception var5) {
            var5.printStackTrace();
            Assert.fail("fail to init the browser");
            return null;
        }
    }

    private void selectDriverBasedOnOs(){
        String operativeSystem = System.getProperty("os.name").toLowerCase();
        if(operativeSystem.contains("mac")){
            geckoDriver = "drivers/mac/geckodriver";
            chromeDriver = "drivers/mac/chromedriver";
        }else if(operativeSystem.contains("windows")){
            geckoDriver = "drivers/windows/geckodriver.exe";
            chromeDriver = "drivers/windows/chromedriver.exe";
        }
    }
}
