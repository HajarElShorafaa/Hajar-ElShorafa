package testCases;

import Data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases extends BaseTest {
    Data data=new Data();

    @Test
    public void TC1_checkPlaceholder(){
        Assert.assertEquals(log.getPlacholder(log.username),data.usernamePlaceholder);
        Assert.assertEquals(log.getPlacholder(log.password),data.passwordPlaceholder);
    }

    @Test
    public void TC2_noEntry() {
        log.clickLogin();
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.usernameRequired);
    }

    @Test
    public void TC3_LoginWithoutUsername() {
        log.enterPassword(data.password);
        log.clickLogin();
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.usernameRequired);
    }

    @Test
    public void TC4_loginWithoutPassword() {
        log.enterUsername(data.standardUser);
        log.clickLogin();
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.passwordRequired);
    }

    @Test
    public void TC5_standardUser(){
        log.Login(data.standardUser, data.password);
        Assert.assertEquals(home.getURL(),data.expectedUrl);
        Assert.assertTrue(home.getInventory().contains(data.backpacksrc));
    }

    @Test
    public void TC6_lockedoutUser() {
        log.Login(data.lockedUser,data.password);
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.lockedError);
    }

    @Test
    public void TC7_problemUser(){
        log.Login(data.problemUser, data.password);
        Assert.assertEquals(home.getURL(),data.expectedUrl);
        Assert.assertTrue(home.getInventory().contains(data.dogsrc));
    }

    @Test
    public void TC8_wrongPassword(){
        log.Login(data.standardUser,data.wrongPassword);
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.wrongCredentials);
    }

}

