package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String covertCountry(String shortCountry) {
        String str = "";
        String convertedCountry = "";
        switch (shortCountry) {
            case "IN":
                convertedCountry = "India";
                break;
            case "US":
                convertedCountry = "United States of America";
                break;
            case "UK":
                convertedCountry = "United Kingdom";
                break;
            case "CA":
                convertedCountry = "Canada";
                break;
            case "AU":
                convertedCountry = "Australia";
                break;
            case "DE":
                convertedCountry = "Germany";
                break;
            case "FR":
                convertedCountry = "France";
                break;
            case "CN":
                convertedCountry = "China";
                break;
            case "BR":
                convertedCountry = "Brazil";
                break;
            case "JP":
                convertedCountry = "Japan";
                break;
        }

        return convertedCountry;
    }

    public static String getGender(String genderID) {
        String str = "";
        String gender = "";
        switch (genderID) {
            case "0":
                gender = "Male";
                break;
            case "1":
                gender = "Female";
                break;
            case "2":
                gender = "Other";
                break;

        }
        return gender;
    }

    public static String convertDate(String dbDate) throws ParseException//1985-03-11 - yyyy-MM-dd
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDate);
        // 11/03/1985 -- dd/MM/yyyy
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

}