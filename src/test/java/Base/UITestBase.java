package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
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

    public static boolean selection(WebElement element)
    {
        boolean actual = false;

        try {
            actual = element.isSelected();
        }
        catch (Exception e)
        {

        }
        return  actual;
    }

    public static String getValueOfAttribute(WebElement element,String attribute)
    {
        String actual = "";

        try {
            actual = element.getAttribute(attribute);
        }
        catch (Exception e)
        {

        }
        return  actual;
    }

    public static String getHexColor(WebElement element,String colorAttribute)
    {
       String rgbColor =  getValueOfStyle(element,colorAttribute);

        return  Color.fromString(rgbColor).asHex();
    }

    public static String spellCheck(WebElement element)
    {
        String actual = "";

        try {
            actual = element.getText();
        }
        catch (Exception e)
        {

        }
        return  actual;
    }

    public static String getValueOfStyle(WebElement element,String css)
    {
        String actual = "";

        try {
            actual = element.getCssValue(css);
        }
        catch (Exception e)
        {

        }
        return  actual;
    }
}


