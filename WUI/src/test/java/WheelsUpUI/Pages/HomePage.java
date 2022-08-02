package WheelsUpUI.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    this.driver=driver;
    }


    @FindBy(xpath = "//*[text()='clear']")
    private WebElement cookie;

    @FindBy(xpath = "//*[@class='heading ui-reveal']")
    private WebElement homePageTitle;

    @FindBy(xpath = "//*[text()='Discover The Possibilities']")
    private WebElement secondTitle;

    @FindBy(xpath = "//*[text()=' 855-FLY-8760 ']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[text()=' info@wheelsup.com ']")
    private WebElement email;

    @FindBy(className = "base-label")
    private WebElement address;

    @FindBy(xpath = "(//*[@class='menu-item'])[1]/a")
    private WebElement flyLink;

    @FindBy(xpath = "(//*[@class='menu-item'])[1]/ul/li[3]/a")
    private WebElement coreMembershipBtn;

 public void clickCookie () {
     cookie.click();
 }

 public void getHomePageTitleText() {
     String titleName = homePageTitle.getText();
     System.out.println(titleName);
 }

 public void getHomePageSecondTitleText(){
     JavascriptExecutor js= (JavascriptExecutor) driver;
     js.executeScript("arguments[0].scrollIntoView();", secondTitle);
     System.out.println(secondTitle.getText());
 }

 public void getContactInfo() {
     JavascriptExecutor js= (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     System.out.println("Phone number is: " + phoneNumber.getText());
     System.out.println("Email is: " + email.getText());
     System.out.println("Address is: " + address.getText());
 }

 public void scrollUp(){
     JavascriptExecutor js= (JavascriptExecutor) driver;
     js.executeScript("window.scrollTo(0, 0);");
 }
 public void clickFlyLink(){
     flyLink.click();
 }
 public void setCoreMembershipBtnClick(){
     coreMembershipBtn.click();
    }







}
