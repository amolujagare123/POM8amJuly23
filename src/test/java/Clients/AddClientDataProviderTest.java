package Clients;

import Base.DoLogin;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;

import java.io.IOException;

import static DataProvider.util.FoDataProvider.getMyData;

public class AddClientDataProviderTest extends DoLogin {

    @Test(dataProvider = "clientData")
    public void addClientTest(String clientName, String clientSurname, String language, String streetAddress1,
                              String streetAddress2, String city, String state, String zipCode, String country,
                              String gender, String birthdate, String phoneNumber, String faxNumber, String mobileNumber,
                              String emailAddress, String webAddress, String vatId, String taxesCode) {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.enterClientName(clientName);
        addClient.enterClientSurname(clientSurname);
        addClient.setLanguage(language);
        addClient.enterClientStreetAddress1(streetAddress1);
        addClient.enterClientStreetAddress2(streetAddress2);
        addClient.enterClientCity(city);
        addClient.enterClientState(state);
        addClient.enterClientZipCode(zipCode);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthdate(birthdate);
        addClient.enterClientPhoneNumber(phoneNumber);
        addClient.enterClientFaxNumber(faxNumber);
        addClient.enterClientMobileNumber(mobileNumber);
        addClient.enterClientEmailAddress(emailAddress);
        addClient.enterClientWebAddress(webAddress);
        addClient.enterClientVATID(vatId);
        addClient.enterClientTaxesCode(taxesCode);
        // Click on the "Save" button
        addClient.clickSave();

        // Add assertions or verifications as needed
    }

    @DataProvider
   Object[][] clientData() throws IOException {
       return  getMyData("","");
   }
}
