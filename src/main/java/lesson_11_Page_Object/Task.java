package lesson_11_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void quitDriver() {
        driver.quit();
        driver = null;
    }

    public void checkPassword() {

        Google google = new Google(getDriver());

        google.searchText("Facebook");

        google.getFirstLink().click();

        FacebookLogin facebookLoginPage = new FacebookLogin(getDriver());
        facebookLoginPage.Login("380931361732", "pass");

        FacebookLoginError errorPage = new FacebookLoginError(getDriver());
        WebElement message = errorPage.getErrorMessage();
        String errorMessageText = message.getText();

        if (errorMessageText.equals("Ви ввели неправильний пароль. Забули пароль?")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED\nHere is an error message: " + errorMessageText);
        }
        quitDriver();
    }

    public void checkEmail() {
        Google google = new Google(getDriver());
        google.searchText("Facebook");
        google.getFirstLink().click();

        FacebookLogin facebookLoginPage = new FacebookLogin(getDriver());
        facebookLoginPage.Login("natalkapoltavkapol950@gmail.com", "1234");

        String errorMessageText = new FacebookLoginError(getDriver())
                .getErrorMessage()
                .getText();

        if (errorMessageText.equals("Указана електронна адреса не відповідає жодному обліковому запису. Зареєструйте новий обліковий запис.")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED\nHere is an error message: " + errorMessageText);
        }
        quitDriver();
    }
}

