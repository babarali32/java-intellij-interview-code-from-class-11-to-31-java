package class29;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class task01 {
    //Create a property file to store following configurations:
    //
    //browser=chrome
    //url=https://facebook.com
    //username
    //password
    //
    //Read file and extract values of browser & url
    public static void main(String[] args) throws IOException {
        String path="Files/automaticCreatedFile.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("browser","chrome");
        properties.put("url","http://facebook.com");
        properties.put("username","syntax");
        properties.put("password","pass123");
        properties.store(fileOutputStream,"this was task in slide");
        FileInputStream fileInputStream=new FileInputStream(path);
        properties.load(fileInputStream);
        properties.getProperty("url");
        properties.getProperty("browser");
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));
    }
}
