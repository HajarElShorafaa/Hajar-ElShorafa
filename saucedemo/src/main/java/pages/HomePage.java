package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    By image =By.xpath("//*[contains(@alt, 'Sauce Labs Backpack')]");
    public String getURL(){
        return driver.getCurrentUrl();
    }
    public String getInventory(){
         return driver.findElement(image).getAttribute("src");
    }

}
