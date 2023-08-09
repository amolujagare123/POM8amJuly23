package UITesting;

import Base.DoLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Dashboard;

import static Base.UITestBase.getHexColor;

public class DashboardTest extends DoLogin {

    Dashboard dashboard;
    @BeforeClass
    public void initDashBoard()
    {
        dashboard = new Dashboard(driver);
    }

    @Test
    public void txtViewedQuoteColorCheck()
    {
        String expected = "#F89406";
        String actual =getHexColor(dashboard.txtViewedQuotes,"color");
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected.toLowerCase(),"wrong color");
    }
}
