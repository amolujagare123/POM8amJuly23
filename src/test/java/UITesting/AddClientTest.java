package UITesting;

import Base.DoLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;

import static Base.UITestBase.*;

public class AddClientTest extends DoLogin {

    AddClient addClient ;
    @BeforeClass
    public void initAddClient()
    {
        addClient = new AddClient(driver);
        Menu menu = new Menu(driver);
        menu.clickAddClient();
    }


    @Test
    public void checkSelectionActive()
    {
        boolean expected = true;
        boolean actual = selection(addClient.active);
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong selection");
    }


    @Test
    public void checkCancelButtonColor()
    {
        String expected = "#d9534f";
        String actual = getHexColor(addClient.cancel,"background-color");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong color");
    }

    @Test
    public void checkSaveButtonColor()
    {
        String expected = "#5cb85c";
        String actual = getHexColor(addClient.save,"background-color");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong color");
    }


}
