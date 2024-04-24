import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class AddAnItemToTheCartTest extends BaseTest{

    @Test
    public void testSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        homePage.closeAdMark();
        MenPage menPage = homePage.clickOnMenPageDropdown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown();
        productPage.clickOnSize();
        productPage.addToCart();


        Assert.assertEquals(productPage.successText(),AssertionMessages.Add_To_Bag);
    }

}
