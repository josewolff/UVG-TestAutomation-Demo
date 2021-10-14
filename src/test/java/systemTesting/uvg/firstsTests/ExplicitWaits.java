package systemTesting.uvg.firstsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class ExplicitWaits extends InitDriver {

    private String url = "http://localhost:8081/register.html";

    @BeforeMethod
    public void init(){
        driver.get(url);
    }

    @Test
    public void f() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleFirstName"))).sendKeys("Testing");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleLastName"))).sendKeys("Testing2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail"))).sendKeys("Testing3@email.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/input[@placeholder='Password']"))).sendKeys("Testing4");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleRepeatPassword"))).sendKeys("Testing4");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register Account')]"))).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
    }

}
