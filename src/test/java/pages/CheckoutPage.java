package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{

   private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By  zipCode = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");
    private final By labelComplete = By.className("complete-header");
    private final By total = By.xpath("//div[@class='summary_info_label summary_total_label']");
    String expectMessage = "THANK YOU FOR YOUR ORDER";

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void firstNameInput(String inputFirstName) {
       driver.findElement(firstName).sendKeys(inputFirstName);
    }

    public void lastNameInput(String inputLastName) {
        driver.findElement(lastName).sendKeys(inputLastName);
    }

    public void zipCodeInput(String inputZipCode) {
     driver.findElement(zipCode).sendKeys(inputZipCode);
    }

    public void setContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void setFinishButtonButton() {
        driver.findElement(finishButton).click();
    }

    public void labelComplete() {
        driver.findElement(labelComplete).getText();
    }

    public void orderConfirmationMessage(){
        expectMessage.equals(labelComplete);
    }

    public String totalLabel() {
       return driver.findElement(total).getText();
    }

}
