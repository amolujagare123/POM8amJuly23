package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    @FindBy (xpath = "//a[@class='hidden-md']")
    WebElement dashboard;
    @FindBy (xpath = "//span[normalize-space()='Clients']")
    WebElement clients;
    @FindBy (xpath = "//a[contains(text(),'Add Client')]")
    WebElement addClient;
    @FindBy (xpath = "//a[normalize-space()='ViewClients']")
    WebElement viewClients;
    @FindBy (xpath = "//span[normalize-space()='Quotes']")
    WebElement quotes;
    @FindBy (xpath = "//a[@class='create-quote']")
    WebElement createQuote;
    @FindBy (xpath = "//a[normalize-space()='View Quotes']")
    WebElement viewQuotes;

    public Menu(WebDriver driver)
    {
        PageFactory .initElements(driver,this);
    }

    public void clickDashboard()
    {
        dashboard.click();
    }

    public void clickAddClient()
    {
        clients.click();
        addClient.click();
    }

    public void viewClient()
    {
        clients.click();
        viewClients.click();
    }

    public void clickCreateQuotes()
    {
        quotes.click();
        createQuote.click();
    }

    public void viewQuotes()
    {
        quotes.click();
        viewQuotes.click();
    }

}
