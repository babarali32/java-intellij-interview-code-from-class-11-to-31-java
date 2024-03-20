package class27And28;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class mapiterator {
    public static void main(String[] args) {
        Map<String, String> fruitMap = new LinkedHashMap<>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("orange", "orange");
        fruitMap.put("grape", "purple");
        fruitMap.put("kiwi", "green");

        Iterator<String> itarator=fruitMap.keySet().iterator();
        while (itarator.hasNext()){
            System.out.println(itarator.next());

        }
        Iterator<String> val=fruitMap.values().iterator();
        while (val.hasNext()){
            System.out.println(val.next());
        }

    }


}