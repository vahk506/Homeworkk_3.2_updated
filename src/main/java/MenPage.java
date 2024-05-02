import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenPage {

    private WebDriver driver;
    WebDriverWait wait;

    public MenPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public MenPage clickOnViewAll() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.VIEW_ALL)).click();
        return this;
    }

    public ProductPage clickOnProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT));
        driver.findElement(Locators.PRODUCT).click();
        return new ProductPage(driver);
    }


    public String successfulSearch() {
        WebElement searchText = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_RESULT));
        boolean isDisplayed = searchText.isDisplayed();

        if (isDisplayed) {
            return "We have products under that ID";
        } else {
            return "We have found 0 products";
        }
    }
    //---MenPage----

    public MenPage clickOnFilterLtoH(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOWEST_TO_HIGHEST)).click();
        return this;
    }

    public String checkThePrices(){
        List<WebElement> priceElements = driver.findElements(Locators.SIMILAR_PRODUCTS);
        List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            prices.add(Double.parseDouble(priceText));
        }

        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);
        if (prices.equals(sortedPrices)) {
            return "Prices are sorted from lowest to highest.";
        } else {
            return "Prices are not sorted from lowest to highest.";
        }
    }
}

