package class29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class writedatademo {
    public static void main(String[] args) throws IOException {
        String path="Files/writedata.properties";
        String path2="C:\\Users\\FM SIFT\\OneDrive\\Desktop\\lahore.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path2);
        Properties properties=new Properties();
        properties.put("one","A");
        properties.put("two","B");
        properties.put("three","C");
        properties.put("four","D");
        properties.put("five","E");
        properties.store(fileOutputStream,"this is my new file");

        fileOutputStream.close();



    }
}
