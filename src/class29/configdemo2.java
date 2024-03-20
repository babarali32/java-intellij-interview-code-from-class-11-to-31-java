package class29;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class configdemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        String val=properties.getProperty("password","");
        System.out.println(val);

        fileInputStream.close();
    }
}
