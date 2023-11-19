package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class ProductsTest extends BaseTest{

    @Test
    public void buyProduct(){

        loginPage.openPage();
        loginPage.login("standard_user","secret_sauce" );
        productsPage.addToCART("Sauce Labs Bike Light");
        productsPage.openCart();

        String productName = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
        assertEquals(productName, "Sauce Labs Bike Light", "Wrong product has been added to the cart");
        String productPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertEquals(productPrice, "$9.99", "Wrong product has been added to the cart");
    }
}
