import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class ProductFilterTest extends BaseTest {

    @Test
    public void TestSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        homePage.closeAdMark();
        MenPage menPage = homePage.clickOnMenPageDropdown();
        menPage.clickOnViewAll();
        menPage.clickOnFilterLtoH();

        Assert.assertEquals(menPage.checkThePrices(), AssertionMessages.Lowest_TO_Highest);

    }
}
