package WheelsUpUI.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestInfoPage {

    private WebDriver driver;
    public RequestInfoPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }


    @FindBy(xpath = "//p[text()='Please select one']")
    private WebElement typeOfTravelDropdown;

    @FindBy(xpath = "//ul[@class='dropdown-box-list']/li[1]")
    private WebElement personalTravel;

    @FindBy(id = "FirstName-clone")
    private WebElement firstNameField;

    @FindBy(id = "LastName-clone")
    private WebElement lastNameField;

    @FindBy(id = "Email-clone")
    private WebElement emailField;

    @FindBy(id = "Phone-clone")
    private WebElement phoneField;

    @FindBy(id = "Address-clone")
    private WebElement addressField;

    @FindBy(id = "City-clone")
    private WebElement cityField;

    @FindBy(id = "PostalCode-clone")
    private WebElement zipCodeField;

    @FindBy(id = "State-clone")
    private WebElement stateField;

    @FindBy(id = "Country-clone")
    private WebElement countryField;

    @FindBy(id = "Company__c-clone")
    private WebElement companyNameField;

    @FindBy(xpath = "//p[text()='HOW MANY PRIVATE FLIGHTS DO YOU TAKE A YEAR?']/parent::div//div[@class='dropdown']")
    private WebElement flightsCountDropdown;

    @FindBy(xpath = "(//p[text()='Please select one'])[1]")
    private WebElement ownOrTravelDropdown;

    @FindBy(xpath = "//p[text()='Do you have a need to travel with pets?']/parent::div//div[@class='dropdown']")
    private WebElement travelWithPetsDropdown;

    @FindBy(xpath = "//p[text()='How did you hear about us?']/parent::div//div[@class='dropdown']")
    private WebElement howDidYouHearDropdown;
//p[text()='Please select one'])[1]
    @FindBy(xpath = "//span[text()='Charter']")
    private WebElement charterField;

    @FindBy(xpath = "//p[text()='1-5']")
    private WebElement flightCount;

    @FindBy(xpath = "(//p[text()='Yes'])[1]")
    private WebElement ownOrTravelValue;

    @FindBy(xpath = "(//p[text()='No'])[2]")
    private WebElement travelWithPetsCount;

    @FindBy(xpath = "(//p[text()='Search Engine'])")
    private WebElement howDidYouHearValue;

    @FindBy(xpath = "(//div[@class='close'])")
    private WebElement closeBtn;

public void clickTypeOfTravelDropDown() {
    typeOfTravelDropdown.click();
}
public void clickPersonalTravel() {
    personalTravel.click();
}
public void fillOutForm(String firstName,String lastName, String email, String phone,String company,String address, String city,String zipCode, String state,String country){
    firstNameField.sendKeys(firstName);
    lastNameField.sendKeys(lastName);
    emailField.sendKeys(email);
    phoneField.sendKeys(phone);
    companyNameField.sendKeys(company);
    addressField.sendKeys(address);
    cityField.sendKeys(city);
    zipCodeField.sendKeys(zipCode);
    stateField.sendKeys(state);
    countryField.sendKeys(country);
}

public void clickFlightsCountDropdown() {
    flightsCountDropdown.click();
}

public void flightsValueClick() {
    flightCount.click();
}

public void ownOrTravelDropdownClick() {
    ownOrTravelDropdown.click();
}

public void ownOrTravelValueClick(){
    ownOrTravelValue.click();
}

public void travelWithPetsDropDownClick(){
    travelWithPetsDropdown.click();
}
public void petsCountValueClick() {
    travelWithPetsCount.click();
}
public void clickCharterField() {
    charterField.click();
}
public void howDidYouHearDropdownClick(){
    howDidYouHearDropdown.click();
}
public void howDidYouHearValueClick(){
        howDidYouHearValue.click();
    }
public void clickCloseBtn(){
    closeBtn.click();
    }






}

