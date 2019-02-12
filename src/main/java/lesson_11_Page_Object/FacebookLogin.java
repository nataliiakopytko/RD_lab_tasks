package lesson_11_Page_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin {
    private WebDriver driver;
    private By emailTextField = By.xpath("//input[@type='email']");
    private By passwordTextField = By.xpath("//input[@type='password']");

    public FacebookLogin(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailTextField() {
        return driver.findElement(emailTextField);
    }

    public WebElement getPasswordTextField() {
        return driver.findElement(passwordTextField);
    }

    public void Login(String email, String password) {
        getEmailTextField().sendKeys(email);
        getPasswordTextField().sendKeys(password);
        getPasswordTextField().sendKeys(Keys.RETURN);
    }
}

