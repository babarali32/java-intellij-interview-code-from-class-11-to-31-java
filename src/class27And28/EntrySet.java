package class27And28;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class EntrySet {
    public static void main(String[] args) {
        Map<String, String> fruitMap = new LinkedHashMap<>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("orange", "orange");
        fruitMap.put("grape", "purple");
        fruitMap.put("kiwi", "green");

       Set<Map.Entry<String,String>> all=fruitMap.entrySet();
       for (Map.Entry<String,String> num:all){
           String onlygetykeys=num.getKey();
           String onlygetvalues=num.getValue();
           System.out.println(onlygetykeys+" = "+onlygetvalues);
       }
    }
}
