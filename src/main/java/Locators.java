import org.openqa.selenium.By;

public class Locators {

    public static final By PRIVACY_MODAL = By.id("onetrust-accept-btn-handler");
    public static final By AD_MARK = By.cssSelector("[class=\"bx-close bx-close-link bx-close-inside\"]");
    public static final By LINK_TO_MEN_PAGE = By.cssSelector("[aria-label=\"Men category\"]");
    public static final By PRODUCT = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/a[1]/div/div");
    public static final By VIEW_ALL = By.xpath("//*[@id=\"top-navigation\"]/div/div/div[4]/div/div/div[1]/div/a[1]");
    public static final By CLOSE_2ND_AD = By.id("bx-close-inside-2347218");
    public static final By SIZE_DROPDOWN_MENU = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]");
    public static final By SIZE = By.xpath("/html/body/div[3]/div[7]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/ul/li[1]");
    public static final By ADD_TO_CART = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[3]/button");
    public static final By ADD_TO_CART_SUCCESS_TEXT = By.className("modal-title");

    public static final By ZipCode = By.className("form-input-postal-code");
    public static final By SEARCH_BUTTON_FOR_ZIPCODE = By.cssSelector("button.btn.btn-primary.qa-btn-search[name='search']");
    public static final By ZipCode_ADDRESS= By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[4]/div/div/div/ul/li/div[1]/div/span");

    public static final By SEARCH_SIGN = By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]/button");
    public static final By SEARCH_TEXT_BOX = By.xpath("//input[@name='search']");
    public static final By Search_BTN = By.className("search-btn");
    public static final By SEARCH_RESULT = By.id("num-results");

    public static final By SIZE_DETAILS = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/button");
    public static final By HOW_TO_MEASURE = By.xpath("//*[@id=\"modal-ember120\"]/div/div[2]/div[1]/ul/li[2]");
    public static final By CHART = By.className("_sizing-content-htm_n0mbkz");

    public static final By LOWEST_TO_HIGHEST = By.cssSelector("#side-sortBy-filter > ul > li:nth-child(2) > label");
    public static final By SIMILAR_PRODUCTS = By.cssSelector("[data-test-product-name=\"\"]");
}