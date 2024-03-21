package rough;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class configclass {
    public static Properties pro;
    public static Properties readproperty(String path) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        pro.load(fileInputStream);
        return pro;
    }
public static String getKey(String key){
        return pro.getProperty(key);
}
}
class commonMethod{
    public static WebDriver driver;
    public static void openBrowser(String path) throws IOException {
        configclass.readproperty("Files/config.properties");
        String browser=configclass.getKey("browser");
        if (browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        } else {
            System.out.println("invalid browser");
        }
        driver.get(configclass.getKey("url"));
    }
    public static void closebrowser(){
        if (driver!=null){
            driver.close();
        }
    }
}
