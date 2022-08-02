package WheelsUpUI.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreMembershipPage {

    private WebDriver driver;

    public CoreMembershipPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;;
    }


    @FindBy(xpath = "(//h1[@data-aos='ui-reveal'])[1]")
    private WebElement titleCoreMembership;

    @FindBy(xpath = "(//h3[@class='title'])[5]")

    private WebElement sharedFlights;

    @FindBy(xpath = "(//h3[@class='title'])[6]")
    private WebElement shuttleFlights;

    @FindBy(xpath = "(//h3[@class='title'])[7]")
    private WebElement hotFlights;

    @FindBy(xpath = "(//h1[@data-aos='ui-reveal'])[4]")
    private WebElement learnMore;

    @FindBy(xpath = "(//app-button)[4]")
    private WebElement continueBtn;

    public void scrollToCoreMembershipTitle(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", titleCoreMembership);
    }

    public void printFlightsText(){
        System.out.println(sharedFlights.getText());
        System.out.println(shuttleFlights.getText());
        System.out.println(hotFlights.getText());
    }

    public void scrollToLearnMore(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", learnMore);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }




























}
