package UITesting;

import Base.OpenUrl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

import static Base.UITestBase.*;

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

    // ------- Check watermark -----

    @Test
    public void txtUsernameWatermarkCheck()
    {
        String expected = "Email";
        String actual = getValueOfAttribute(login.txtUsername, "placeholder");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong value of watermark");
    }

    @Test
    public void txtPasswordWatermarkCheck()
    {
        String expected = "Password";
        String actual = getValueOfAttribute(login.txtPassword, "placeholder");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong value of watermark");
    }

    // ---- spellCheck -----

    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual = spellCheck(login.lblEmail);
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong spelling");

    }

    @Test
    public void lblPasswordSpellCheck()
    {
        String expected = "Password";
        String actual = spellCheck(login.lblPassword);
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong spelling");

    }

    // ---- Font related tests -----

    @Test
    public void lblEmailFontCheck()
    {
        String expected  = "14px";
        String actual = getValueOfStyle(login.lblEmail,"font-size");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong font-size");
    }

    @Test
    public void lblEmailFontFamily()
    {
        String expected  = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = getValueOfStyle(login.lblEmail,"font-family");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong font");
    }

}
