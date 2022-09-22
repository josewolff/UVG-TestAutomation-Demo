package systemTesting.uvg.pom;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import utils.GlobalVariables;

public class CreateUserPom extends InitDriver {
    private CreateUser createUser;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        final String url = GlobalVariables.seleniumHost + "/register.html";
        driver.get(url);
        createUser = new CreateUser(driver,wait);
    }

    @Test(groups = {"all","seleniumPom"})
    public void f() throws InterruptedException {
        Thread.sleep(5000);
        createUser.createUserMethod();
    }
}
