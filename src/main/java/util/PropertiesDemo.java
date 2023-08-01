package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("config/config.properties");

        // 2. create the object of Properties class
        Properties prop = new Properties();

        // 3. load file object to prop
        prop.load(fis);

        // 4. get the values

        System.out.println(prop.get("url"));
        System.out.println(prop.get("username"));
        System.out.println(prop.get("password"));
    }
}
