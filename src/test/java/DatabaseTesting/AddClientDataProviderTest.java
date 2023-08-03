package DatabaseTesting;

import Base.DoLogin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import static util.FoDataProvider.getMyData;

public class AddClientDataProviderTest extends DoLogin {

    @Test(dataProvider = "clientData")
    public void addClientTest(String clientName, String clientSurname, String language, String streetAddress1,
                              String streetAddress2, String city, String state, String zipCode, String country,
                              String gender, String birthdate, String phoneNumber, String faxNumber, String mobileNumber,
                              String emailAddress, String webAddress, String vatId, String taxesCode) throws ClassNotFoundException, SQLException {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        ArrayList<String> expected = new ArrayList<>();
        expected.add(clientName);
        expected.add(clientSurname);
        expected.add(language);
        expected.add(streetAddress1);
        expected.add(streetAddress2);
        expected.add(city);
        expected.add(state);
        expected.add(zipCode);
        expected.add(country);
        expected.add(gender);
        expected.add(birthdate);
        expected.add(phoneNumber);
        expected.add(faxNumber);
        expected.add(mobileNumber);
        expected.add(emailAddress);
        expected.add(webAddress);
        expected.add(vatId);
        expected.add(taxesCode);

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
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/ip";
        Connection con = DriverManager.getConnection(url,user,pass);
        Statement st = con.createStatement();

        String sql = "SELECT * FROM ip_clients where client_name='"+clientName+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();

        while (rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));
            actual.add(rs.getString("client_country"));
            actual.add(rs.getString("client_gender"));
            actual.add(rs.getString("client_birthdate"));
            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_fax"));
            actual.add(rs.getString("client_mobile"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_vat_id"));
            actual.add(rs.getString("client_tax_code"));
        }

        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        // Add assertions or verifications as needed

   //     Assert.assertEquals(actual,expected);

    }

    @DataProvider
   Object[][] clientData() throws IOException {
       return  getMyData("Data/InvoicePlane.xlsx","db Testing");
   }
}
