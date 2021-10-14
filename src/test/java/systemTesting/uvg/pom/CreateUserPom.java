package systemTesting.uvg.pom;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class CreateUserPom extends InitDriver {

    private String url = "http://localhost:8081/register.html";
    private CreateUser createUser;

    @BeforeMethod
    public void init(){
        driver.get(url);
        createUser = new CreateUser(driver,wait);
    }

    @Test
    public void f() throws InterruptedException {
        Thread.sleep(5000);
        createUser.createUserMethod();
    }
}
