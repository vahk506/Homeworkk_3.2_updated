import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductPage {

    private WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public ProductPage closeSecondAd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CLOSE_2ND_AD)).click();
        return this;
    }
    public ProductPage clickOnSizeDropDown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE_DROPDOWN_MENU)).click();
        return this;
    }

    public ProductPage clickOnSize() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE));
        driver.findElement(Locators.SIZE).click();
        return this;
    }

    public ProductPage addToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_TO_CART)).click();
        return this;
    }

    public String successText () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_TO_CART_SUCCESS_TEXT)).click();
        return driver.findElement(Locators.ADD_TO_CART_SUCCESS_TEXT).getText();
    }

    // ---- methods for ZipCode Test
    public ProductPage addZipCode(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ZipCode)).sendKeys("12345");
        return this;
    }
    public ProductPage clickOnSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_BUTTON_FOR_ZIPCODE)).click();
        return this;
    }
    public String addressInfo(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ZipCode_ADDRESS)).getText();
    }
    //-------SizeDetailsTest----

    public ProductPage clickOnSizeDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE_DETAILS)).click();
        return this;
    }
    public ProductPage clickOnHowToMeasure(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HOW_TO_MEASURE)).click();
        return this;
    }

    public boolean isChartDisplayed(){
        WebElement chart = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CHART));
        return chart.isDisplayed();
    }

}
