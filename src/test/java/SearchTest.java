import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ScreenshotListener.class)
public class SearchTest extends BaseTest{

    @Test
    public void SearchForTest() throws InterruptedException {
        homePage.acceptPrivacyModal();
        homePage.closeAdMark();
        homePage.clickOnSearchSign();
        homePage.addTextSearch();
        MenPage menPage = homePage.clickOnSearchButton();

        Assert.assertEquals(menPage.successfulSearch(),AssertionMessages.Search_Result);

    }

    }


