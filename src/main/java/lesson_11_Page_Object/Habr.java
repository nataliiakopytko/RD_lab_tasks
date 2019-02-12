package lesson_11_Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This class was designed just for checking how to work with SourceTree

public class Habr {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//input[@title = 'Пошук']"));
        element.sendKeys("habr");
        element.sendKeys(Keys.RETURN);
        driver.quit();
    }

}
