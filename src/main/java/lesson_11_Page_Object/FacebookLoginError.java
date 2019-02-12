package lesson_11_Page_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginError {
    private WebDriver driver;
    private By errorMessage = By.xpath("//div[@class='_4rbf _53ij']");

    public FacebookLoginError(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }
}
