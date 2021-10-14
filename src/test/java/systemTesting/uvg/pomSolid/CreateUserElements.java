package systemTesting.uvg.pomSolid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUserElements {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(id = "exampleFirstName")
    protected WebElement firstName;

    @FindBy(id = "exampleLastName")
    protected WebElement lastName;

    @FindBy(id = "exampleInputEmail")
    protected WebElement email;

    @FindBy(xpath = "//div/div/input[@placeholder='Password']")
    protected WebElement password;

    @FindBy(id = "exampleRepeatPassword")
    protected WebElement rPassword;

    @FindBy(xpath = "//a[contains(text(),'Register Account')]")
    protected WebElement registerBtn;
}
