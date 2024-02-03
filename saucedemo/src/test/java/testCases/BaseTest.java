package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    WebDriver driver;
    LoginPage log;
    HomePage home;

    @BeforeMethod
    public void setup() {
        driver= new ChromeDriver();
         log=new LoginPage(driver);
         home=new HomePage(driver);
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
