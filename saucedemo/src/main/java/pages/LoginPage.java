package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LoginPage {
        WebDriver driver;
        public LoginPage(WebDriver driver){
            this.driver=driver;
        }

        public By username= By.id("user-name");
        public By password= By.id("password");
        By LoginBtn= By.id("login-button");
        By Error=By.xpath("//h3[@data-test='error']");
        public By errorIcon=By.xpath("//*[contains(@class, 'error_icon')]");

        public String getPlacholder(By inputfield) {
            return driver.findElement(inputfield).getAttribute("placeholder");
        }
        public int getErrorIcon()
        {
             return driver.findElements(errorIcon).size();
        }
        public String getErrorText(){
            return driver.findElement(Error).getText();
        }
        public void Login(String name, String pass) {
            driver.findElement(username).sendKeys(name);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(LoginBtn).click();
        }
        public void enterUsername(String name)
        {
            driver.findElement(username).sendKeys(name);
        }
        public void enterPassword(String pass)
        {
            driver.findElement(password).sendKeys(pass);
        }
        public void clickLogin()
        {
            driver.findElement(LoginBtn).click();
        }
}