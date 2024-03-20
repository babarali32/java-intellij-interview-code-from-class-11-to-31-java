package class29;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class configfiledemo {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\FM SIFT\\OneDrive\\Desktop\\your.properties";

        // making connection to the file, navigating the path. if connection is created then good.
        FileInputStream fileInputStream=new FileInputStream(path);

        // to read the data from property file , there is class propertes class
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("username"));

    }
}
