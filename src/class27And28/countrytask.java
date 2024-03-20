package class27And28;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class countrytask {
    public static void main(String[] args) {
        Map<String, String> country = new LinkedHashMap<>();
        //Adding country-capital pairs to the map
        country.put("Germany", "Berlin");
        country.put("Japan", "Tokyo");
        country.put("India", "New Delhi");
        country.put("China", "Beijing");
        country.put("Brazil", "Brasília");
        country.put("Russia", "Moscow");
        Iterator<String>  values =country.values().iterator();
         while (values.hasNext()){
             values.next();
             System.out.println(values.next());
         }
    }
}
