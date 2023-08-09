package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    @FindBy (xpath = "//div[contains(@id,'quote')]//*[@class='viewed']")
    public WebElement txtViewedQuotes;

    public Dashboard(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}
