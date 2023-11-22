package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckoutTest extends BaseTest{

    @Test(description = "e2e")
    public void checkout(){
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCART("Sauce Labs Bike Light");
        productsPage.addToCART("Sauce Labs Bolt T-Shirt");
        productsPage.openCart();
        cartPage.shoppingCartBadge();
        cartPage.proceedToCheckout();
        checkoutPage.firstNameInput("John");
        checkoutPage.lastNameInput("Smith");
        checkoutPage.zipCodeInput("123456");
        checkoutPage.setContinueButton();
        assertEquals(checkoutPage.totalLabel(), "Total: $28.06","Checkout: Products are matched");
        checkoutPage.setFinishButtonButton();
        checkoutPage.labelComplete();
        checkoutPage.orderConfirmationMessage();

    }
}
