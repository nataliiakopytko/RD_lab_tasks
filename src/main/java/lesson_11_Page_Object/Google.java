package lesson_11_Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google {

    private WebDriver driver;

    private By searchField = By.xpath("//input[@name='q']");
    private By firstLink = By.xpath("//h3[@class='LC20lb']");

    public Google (WebDriver driver){
        this.driver = driver;
        this.driver.get("https://www.google.com");
    }

    public WebElement getSearchField() {
        return driver.findElement(searchField);
    }

    public WebElement getFirstLink() {
        return driver.findElement(firstLink);
    }

    public void searchText(String text){
        getSearchField().sendKeys(text);
        getSearchField().sendKeys(Keys.RETURN);
    }
}
