package testCases;

import Data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases extends BaseTest {
    Data data=new Data();

    @Test
    public void checkPlaceholder(){
        Assert.assertEquals(log.getPlacholder(log.username),data.usernamePlaceholder);
        Assert.assertEquals(log.getPlacholder(log.password),data.passwordPlaceholder);
    }

    @Test
    public void noEntry() {
        log.clickLogin();
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.usernameRequired);
    }

    @Test
    public void LoginWithoutUsername() {
        log.enterPassword(data.password);
        log.clickLogin();
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.usernameRequired);
    }

    @Test
    public void loginWithoutPassword() {
        log.enterUsername(data.standardUser);
        log.clickLogin();
        Assert.assertEquals(log.getErrorIcon(),2);
        Assert.assertEquals(log.getErrorText(),data.passwordRequired);
    }

    @Test
    public void standardUser(){
        log.Login(data.standardUser, data.password);
        Assert.assertEquals(home.getURL(),data.expectedUrl);
        Assert.assertTrue(home.getInventory().contains(data.backpacksrc));
    }

    @Test
    public void lockedoutUser() {
        log.Login(data.lockedUser,data.password);
        Assert.assertEquals(log.getErrorText(),data.lockedError);
    }

    @Test
    public void problemUser(){
        log.Login(data.problemUser, data.password);
        Assert.assertEquals(home.getURL(),data.expectedUrl);
        Assert.assertTrue(home.getInventory().contains(data.dogsrc));
    }

    @Test
    public void glitchUser(){
        log.Login(data.glitchUser, data.password);
        Assert.assertEquals(home.getURL(),data.expectedUrl);
    }

}

