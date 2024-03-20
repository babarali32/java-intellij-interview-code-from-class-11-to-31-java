package class27And28;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.HashMap;
import java.util.Map;
public class mapDemp {
    public static void main(String[] args) {

        Map<Integer,String> mp=new HashMap<>();
        mp.put(100,"one");
        mp.put(200,"two");
        mp.put(300,"three");

        System.out.println(mp.get(200));

        XSSFWorkbook obj=new XSSFWorkbook();
    }
}
