package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest{

    @Test
    public void successfulLogin() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");

        assertEquals(productsPage.getTitle(),
                "Products", "User is not logged in or wrong page");
    }

    @Test
    public void wrongUserName() {
        loginPage.openPage();
        loginPage.login("user", "secret_sauce");

        String message = driver.findElement(By.cssSelector(".error")).getText();
        assertEquals(loginPage.getError(), "Epic sadface: Username and password do not match any user in this service", "So bad!");
    }

    @Test
    public void wrongPassword() {

        loginPage.openPage();
        loginPage.login("standard_user", "secret");

        assertEquals(loginPage.getError(), "Epic sadface: Username and password do not match any user in this service", "So bad!");
    }

    @Test
    public void lockedUser() {
        loginPage.openPage();
        loginPage.login("locked_out_user", "secret_sauce");

        assertEquals(loginPage.getError(), "Epic sadface: Sorry, this user has been locked out.", "So bad!");
    }

    @Test
    public void emptyFields() {
        loginPage.openPage();
        loginPage.login("", "");

        assertEquals(loginPage.getError(), "Epic sadface: Username is required", "So bad!");
    }
}