package lesson_9_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );

        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//input[@title = 'Пошук']"));
        element.sendKeys("жізньболь");
        element.sendKeys(Keys.RETURN);
//        WebElement element1 = driver.findElement(By.xpath("//div[@class='aajZCb']//input[@value = 'Пошук Google']"));
//        element1.click();

        By yahooSearchInput = By.xpath("//input[@id='uh-search-box']");
        By yahooSearchInput1 = By.id("uh-search-box");

        driver.navigate().to("http://yahoo.com");
        driver.findElement(yahooSearchInput).sendKeys("asdqweasd");

        driver.quit();
    }
}
