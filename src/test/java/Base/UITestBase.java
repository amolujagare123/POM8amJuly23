package Base;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UITestBase {

    public static boolean visibility(WebElement element)
    {
       boolean actual = false;

        try {
            actual = element.isDisplayed();
        }
        catch (Exception e)
        {

        }
       return  actual;
    }

    public static boolean enability(WebElement element)
    {
        boolean actual = false;

        try {
            actual = element.isEnabled();
        }
        catch (Exception e)
        {

        }
        return  actual;
    }
}
