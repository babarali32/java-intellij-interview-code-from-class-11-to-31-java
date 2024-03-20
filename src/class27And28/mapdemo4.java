package class27And28;
import java.util.*;
public class mapdemo4 {
    public static void main(String[] args) {

        Map<String, String> fruitMap = new LinkedHashMap<>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("orange", "orange");
        fruitMap.put("grape", "purple");
        fruitMap.put("kiwi", "green");

        Iterator<String> two=fruitMap.keySet().iterator();
        while (two.hasNext()){
            String val=two.next();
            System.out.println(val);
        }
        Set<String> keys=fruitMap.keySet();
        System.out.println(keys);

        Collection<String> values=fruitMap.values();
        System.out.println(values);
    }
}
