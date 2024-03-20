package FileUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class configReader {

    public static String read(String path, String keys) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        properties.getProperty(keys);

        return properties.getProperty(keys);
    }
    public static String read(String keys) throws IOException {
        return read("Files/config.properties",keys);
    }
}
class configtester{
    public static void main(String[] args) throws IOException {
        configReader obj=new configReader();   // do not need create object for static method call
        configReader.read("username");
        System.out.println(configReader.read("username"));

    }
    }