package systemTesting.uvg.firstsTests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import utils.GlobalVariables;

public class MyFirstStepsWithSelenium extends InitDriver {

    @BeforeMethod
    public void init(){
        final String url = GlobalVariables.seleniumHost + "/register.html";
        driver.get(url);
    }

    @Test(groups = {"all","myFirstTest"})
    public void f() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("exampleFirstName")).sendKeys("Jose Andres");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleLastName")).sendKeys("Wolff");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleInputEmail")).sendKeys("email@laserants.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/input[@placeholder='Password']")).sendKeys("Password");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleRepeatPassword")).sendKeys("Password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Register Account')]")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
    }

}
