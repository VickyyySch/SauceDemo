package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorTest extends BaseTest {


    @Test
    public void locator() {
        driver.get(" https://www.saucedemo.com/");
        driver.findElement(By.id("inventory_container"));
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        driver.findElement(By.className("shopping_cart_link"));
        driver.findElement(By.tagName("robots"));
        driver.findElement(By.linkText("icon"));
        driver.findElement(By.partialLinkText("sheet"));
        driver.findElement(By.xpath("//button[@id='continue-shopping']"));
        driver.findElement(By.xpath("//tag[@attribute='pricebar']"));
        //Search by Attribute:
        driver.findElement(By.xpath("//button[@type='submit']"));
        //Search by Text:
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        //Search by Partial Attribute Match:
        driver.findElement(By.xpath("//input[contains(@class,'input_')]"));
        //Search by Partial Text Match:
        driver.findElement(By.xpath("//span[contains(text(),'Sauce Labs Bolt T-Shirt')]"));
        //Ancestor:
        driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']//ancestor::div"));
        //Descendant:
        driver.findElement(By.xpath("//div[@class='inventory_list']//descendant::button"));
        //Following:
        driver.findElement(By.xpath("//span[text()='Sauce Labs Onesie']//following::button"));
        //Parent:
        driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']//parent::div"));
        //Preceding:
        driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']//preceding::button"));
        //Find Element with AND Condition:
        driver.findElement(By.xpath("//button[@class='btn_secondary btn_inventory' and @data-test='add-to-cart-sauce-labs-backpack']"));

        //By css Class:
        driver.findElement(By.cssSelector(".inventory_details"));
        //By Multiple Classes:
        driver.findElement(By.cssSelector(".inventory_details.inventory_red"));
        //By Descendant Class:
        driver.findElement(By.cssSelector(".inventory_details .inventory_red"));
        //By ID:
        driver.findElement(By.cssSelector("#item-4-title"));
        //By Tagname:
        driver.findElement(By.cssSelector("button"));
        //By Tagname and Class:
        driver.findElement(By.cssSelector("div.inventory_details"));
        //By Attribute Equals Value:
        driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']"));
        //By Attribute Contains Value:
        driver.findElement(By.cssSelector("[data-test~=add-to-cart]"));
        //By Attribute Starts With Value:
        driver.findElement(By.cssSelector("[data-test^='add-to-cart']"));
        //By Attribute Ends With Value:
        driver.findElement(By.cssSelector("[data-test$='sauce-labs-backpack']"));
        //By Attribute Contains Substring Value:
        driver.findElement(By.cssSelector("[data-test*='sauce-labs']"));

    }
}