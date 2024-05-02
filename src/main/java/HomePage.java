import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private final WebDriver driver;
    WebDriverWait wait ;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public HomePage acceptPrivacyModal() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRIVACY_MODAL));
            driver.findElement(Locators.PRIVACY_MODAL).click();
        return this;
    }

    public HomePage closeAdMark(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.AD_MARK));
        driver.findElement(Locators.AD_MARK).click();
        return this;
    }

    public MenPage hoverOnMenPageDropdown() throws InterruptedException {
        var actions = new Actions(driver);
        WebElement figure1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LINK_TO_MEN_PAGE));
        actions.moveToElement(figure1).perform();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LINK_TO_MEN_PAGE));
        return new MenPage(driver);
    }

    //-----------------

    public HomePage clickOnSearchSign(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_SIGN)).click();
        return this;
    }
    public HomePage addTextSearch(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_TEXT_BOX)).sendKeys("1149");
        return this;
    }
    public MenPage clickOnSearchButton(){
        driver.findElement(Locators.Search_BTN).click();
        return new MenPage(driver);
    }
}
