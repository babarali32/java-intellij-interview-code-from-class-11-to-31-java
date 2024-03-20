package class27And28;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class task01 {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.
        Map<String, String> country = new LinkedHashMap<>();
// Adding country-capital pairs to the map
        country.put("Germany", "Berlin");
        country.put("Japan", "Tokyo");
        country.put("India", "New Delhi");
        country.put("China", "Beijing");
        country.put("Brazil", "Brasília");
        country.put("Russia", "Moscow");

        Set<String>  print =country.keySet();
        for (String val:print) {
            System.out.println(val);
        }
        Collection<String> sum=country.values();
        for (String one:sum
             ) {
            System.out.println(one);
        }

    }
}