import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class SizeDetailsTest extends BaseTest{

    @Test
    public void TestSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        homePage.closeAdMark();
        MenPage menPage = homePage.clickOnMenPageDropdown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDetails();
        productPage.clickOnHowToMeasure();

  Assert.assertEquals(productPage.isChartDisplayed(),AssertionMessages.ChartDisplayed);

    }

}


