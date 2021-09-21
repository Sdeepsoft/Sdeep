package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String Readprop(String Propname) throws IOException {
        FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Properties\\Propertiesname.properties");
        Properties property=new Properties();
        property.load(fs);
        return property.getProperty(Propname);
    }

}
