package systemTesting.uvg.pomSolid;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import utils.GlobalVariables;

public class CreateUserPomSolidTests extends InitDriver {
    private CreateUserActions createUser;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        String url = GlobalVariables.seleniumHost + "/register.html";
        System.out.println(url);
        driver.get(url);
        createUser = new CreateUserActions(driver,wait);
    }

    @Test(groups = {"all","seleniumPomSolid"})
    public void f() throws InterruptedException {
        Thread.sleep(5000);
        createUser.createUserMethod();
    }
}
