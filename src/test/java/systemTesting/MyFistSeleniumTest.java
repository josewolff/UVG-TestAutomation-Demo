package systemTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFistSeleniumTest extends InitDriver {

    @BeforeClass(alwaysRun = true)
    public void initUrl(){
        driver.get("https://google.com");

    }

    @Test(groups = {"myfirstTest"})
    public void myfirstTest() throws InterruptedException {
        System.out.println("hello");
        Thread.sleep(10000);
    }
}