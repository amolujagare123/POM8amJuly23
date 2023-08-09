package pages.clients;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {
    // Constructor to initialize the elements in the page
    public AddClient(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='client_name']")
    WebElement clientName;

    @FindBy(xpath = "//input[@name='client_surname']")
    WebElement clientSurname;

    @FindBy(xpath = "//input[@name='client_address_1']")
    WebElement clientStreetAddress1;

    @FindBy(xpath = "//input[@name='client_address_2']")
    WebElement clientStreetAddress2;

    @FindBy(xpath = "//input[@name='client_city']")
    WebElement clientCity;

    @FindBy(xpath = "//input[@name='client_state']")
    WebElement clientState;

    @FindBy(xpath = "//input[@name='client_zip']")
    WebElement clientZipCode;

    @FindBy(xpath = "//input[@name='client_phone']")
    WebElement clientPhoneNumber;

    @FindBy(xpath = "//input[@name='client_fax']")
    WebElement clientFaxNumber;

    @FindBy(xpath = "//input[@name='client_mobile']")
    WebElement clientMobileNumber;

    @FindBy(xpath = "//input[@name='client_email']")
    WebElement clientEmailAddress;

    @FindBy(xpath = "//input[@name='client_web']")
    WebElement clientWebAddress;

    @FindBy(xpath = "//input[@name='client_vat_id']")
    WebElement clientVATID;

    @FindBy(xpath = "//input[@name='client_tax_code']")
    WebElement clientTaxesCode;

    // Action methods for interacting with the elements

    public void enterClientName(String name) {
        clientName.sendKeys(name);
    }

    public void enterClientSurname(String surname) {
        clientSurname.sendKeys(surname);
    }

    public void enterClientStreetAddress1(String address) {
        clientStreetAddress1.sendKeys(address);
    }

    public void enterClientStreetAddress2(String address) {
        clientStreetAddress2.sendKeys(address);
    }

    public void enterClientCity(String city) {
        clientCity.sendKeys(city);
    }

    public void enterClientState(String state) {
        clientState.sendKeys(state);
    }

    public void enterClientZipCode(String zipCode) {
        clientZipCode.sendKeys(zipCode);
    }

    public void enterClientPhoneNumber(String phoneNumber) {
        clientPhoneNumber.sendKeys(phoneNumber);
    }

    public void enterClientFaxNumber(String faxNumber) {
        clientFaxNumber.sendKeys(faxNumber);
    }

    public void enterClientMobileNumber(String mobileNumber) {
        clientMobileNumber.sendKeys(mobileNumber);
    }

    public void enterClientEmailAddress(String email) {
        clientEmailAddress.sendKeys(email);
    }

    public void enterClientWebAddress(String webAddress) {
        clientWebAddress.sendKeys(webAddress);
    }

    public void enterClientVATID(String vatID) {
        clientVATID.sendKeys(vatID);
    }

    public void enterClientTaxesCode(String taxesCode) {
        clientTaxesCode.sendKeys(taxesCode);
    }
    @FindBy (xpath = "//input[@name='client_active']")
    public WebElement active;
    @FindBy (xpath = "//button[@name='btn_cancel']")
    public  WebElement cancel;
    @FindBy (xpath = "//button[@name='btn_submit']")
    public WebElement save;
    public void clickSave()
    {
        save.click();
    }

    @FindBy (xpath = "//span[@id='select2-client_language-container']")
    WebElement languageContainer;
    @FindBy (xpath = "//input[@role='searchbox']") WebElement searchbox;
    public void setLanguage(String language)
    {
        languageContainer.click();
        searchbox.sendKeys(language);
        //searchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }
    @FindBy (xpath = "//span[@id='select2-client_country-container']")
    WebElement containerCountry;

    WebDriver driver;
    public void setCountry(String country)
    {
        containerCountry.click();
        searchbox.sendKeys(country);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy (xpath = "//span[@id='select2-client_gender-container']") WebElement containerGender;
    public void setGender(String gender)
    {
        containerGender.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();

    }

    @FindBy (xpath = "//input[@name='client_birthdate']")
    WebElement birthdate;

    public void setBirthdate(String date)
    {
        /*birthdate.sendKeys(date);
        birthdate.sendKeys(Keys.ENTER);*/

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+date+"')",birthdate);
    }
}
