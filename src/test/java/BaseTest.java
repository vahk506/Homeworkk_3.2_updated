import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;
    HomePage homePage;


    @BeforeClass
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ae.com/us/en");
        homePage = new HomePage(driver);

        ScreenshotListener screenshotListener = new ScreenshotListener();
        screenshotListener.setDriver(driver);
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
