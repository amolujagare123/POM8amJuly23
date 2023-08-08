package UITesting;

import Base.OpenUrl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

import static Base.UITestBase.enability;
import static Base.UITestBase.visibility;

public class LoginTest extends OpenUrl {
    Login login;
    @BeforeClass
    public void init()
    {
        login = new Login(driver);
    }

    @Test
    public void txtUsernameVisibilityCheck()
    {

        boolean expected = true;
        boolean actual = false;

        try {
             actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"the username text box is not present");
    }


    // ------- visibility -----
    @Test
    public void txtUsernameVisibilityCheck2() {
        boolean expected = true;
        boolean actual = visibility(login.txtUsername);
        Assert.assertEquals(actual,expected,"the username text box is not present");
    }

    @Test
    public void txtPasswordVisibilityCheck() {
        boolean expected = true;
        boolean actual = visibility(login.txtPassword);
        Assert.assertEquals(actual,expected,"the password text box is not present");
    }

    @Test
    public void btnLoginVisibilityCheck() {
        boolean expected = true;
        boolean actual = visibility(login.btnLogin);
        Assert.assertEquals(actual,expected,"login button is not present");
    }

    // ------- enability -----

    @Test
    public void txtUsernameEnabilityCheck() {
        boolean expected = true;
        boolean actual = enability(login.txtUsername);
        Assert.assertEquals(actual,expected,"the username text box is enabled");
    }
    @Test
    public void txtPasswordEnabilityCheck() {
        boolean expected = true;
        boolean actual = enability(login.txtPassword);
        Assert.assertEquals(actual,expected,"the password text box is enabled");
    }

    @Test
    public void btnLoginEnabilityCheck() {
        boolean expected = true;
        boolean actual = enability(login.btnLogin);
        Assert.assertEquals(actual,expected,"login text box is enabled");
    }
}
