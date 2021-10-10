package systemTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFistSeleniumTest extends InitDriver {

    @BeforeClass(alwaysRun = true)
    public void initUrl(){
        driver.get("https://google.com");

    }

    @Test(groups = {"myfirstTest"})
    public void myfirstTest() {
        System.out.println("hello");
    }
}