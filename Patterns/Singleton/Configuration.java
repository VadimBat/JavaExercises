import java.util.*;
import java.io.*;

public class Configuration {
    private static Configuration instance = null;
    private Properties properties;
    private Configuration (){
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    new File("props.txt"));
            properties.load(fis);
        } catch (Exception e) {
            //exception message
        }
    }

    public synchronized static Configuration getInstance() {
        if (instance == null)
            instance = new Configuration();
        return instance;
    }

    public synchronized String getProperty(String key) {
        String value = null;
        if (properties.containsKey(key))
            value = (String) properties.get(key);
        else {
            // property can`t be found
        }
        return value;
    }
}