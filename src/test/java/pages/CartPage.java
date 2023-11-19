package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By cartItemName = By.className("inventory_item_name");
    private final By cartItemPrice = By.className("inventory_item_price");
    private final By checkoutButton = By.cssSelector(".checkout_button");


    public String getCartItemName() {
        return driver.findElement(cartItemName).getText();
    }

    public String getCartItemPrice() {
        return driver.findElement(cartItemPrice).getText();
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}