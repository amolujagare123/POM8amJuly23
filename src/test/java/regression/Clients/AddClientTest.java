package regression.Clients;

import Base.DoLogin;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;

public class AddClientTest extends DoLogin {

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);


        addClient.enterClientName("John1");
        addClient.enterClientSurname("Doe");
        addClient.setLanguage("English");
        addClient.enterClientStreetAddress1("123 Main Street");
        addClient.enterClientStreetAddress2("123 Main Street");
        addClient.enterClientCity("New York");
        addClient.enterClientState("NY");
        addClient.enterClientZipCode("10001");
        addClient.setCountry("China");
        addClient.setGender("Female");
        addClient.setBirthdate("05/11/1985");
        addClient.enterClientPhoneNumber("555-123-4567");
        addClient.enterClientFaxNumber("123-456-7899");
        addClient.enterClientMobileNumber("987-654-3210");
        addClient.enterClientEmailAddress("john.doe@example.com");
        addClient.enterClientWebAddress("www.example.com");
        addClient.enterClientVATID("123456789");
        addClient.enterClientTaxesCode("TAX-789");
        // Click on the "Save" button
        addClient.clickSave();

    }
}
