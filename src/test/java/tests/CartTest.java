package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTest{

    @Test()
    public void cartWithMultipleProducts() {

        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCART("Sauce Labs Bike Light");
        productsPage.addToCART("Sauce Labs Bolt T-Shirt");
        productsPage.openCart();

        assertEquals(cartPage.shoppingCartBadge(), "2", "Pass: The number '2' is present in the shopping cart badge");

        cartPage.proceedToCheckout();

    }
}