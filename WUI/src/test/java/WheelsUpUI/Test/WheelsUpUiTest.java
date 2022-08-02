package WheelsUpUI.Test;

import WheelsUpUI.Pages.CoreMembershipPage;
import WheelsUpUI.Pages.HomePage;
import WheelsUpUI.Pages.RequestInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WheelsUpUiTest {
    WebDriver driver;
    HomePage homePage;
    RequestInfoPage requestInfoPage;
    CoreMembershipPage coreMembershipPage;
    String webDriverAddress="webdriver.chrome.driver";
    String webDriverPath = "src/main/resources/chromedriver.exe";

    @BeforeMethod
    public void setup () throws InterruptedException {
        System.setProperty(webDriverAddress, webDriverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://wheelsup.com");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        coreMembershipPage= new CoreMembershipPage(driver);
        requestInfoPage= new RequestInfoPage(driver);


    }

    @Test
    public void WheelsUpUITestCase() throws InterruptedException {
        homePage.clickCookie();
        Thread.sleep(1000);
        homePage.getHomePageTitleText();
        Thread.sleep(1000);
        homePage.getHomePageSecondTitleText();
        homePage.getContactInfo();
        homePage.scrollUp();
        homePage.clickFlyLink();
        homePage.setCoreMembershipBtnClick();


        coreMembershipPage.scrollToCoreMembershipTitle();
        coreMembershipPage.printFlightsText();
        coreMembershipPage.scrollToLearnMore();
        Thread.sleep(2000);
        coreMembershipPage.clickContinueBtn();


        String currentUrl= driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("request-info"), "URL contains request-info");



        requestInfoPage.clickTypeOfTravelDropDown();
        Thread.sleep(2000);
        requestInfoPage.clickPersonalTravel();

        requestInfoPage.fillOutForm("Ilkin", "Hajiyev", "ilkin.ehajiyev@gmail.com",
                "617-678-3339","WheelsUp", "ABC street", "Ashland", "01721","MA", "USA" );


       requestInfoPage.clickFlightsCountDropdown();
        Thread.sleep(3000);
        requestInfoPage.flightsValueClick();
        requestInfoPage.ownOrTravelDropdownClick();
        Thread.sleep(3000);
        requestInfoPage.ownOrTravelValueClick();
        requestInfoPage.travelWithPetsDropDownClick();
        Thread.sleep(3000);
        requestInfoPage.petsCountValueClick();
        requestInfoPage.clickCharterField();
        requestInfoPage.howDidYouHearDropdownClick();
        Thread.sleep(3000);
        requestInfoPage.howDidYouHearValueClick();
        requestInfoPage.clickCloseBtn();



    }



}
