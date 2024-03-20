package class27And28;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class iteratorEntryset {
    public static void main(String[] args) {
        Map<String, String> fruitMap = new LinkedHashMap<>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("orange", "orange");
        fruitMap.put("grape", "purple");
        fruitMap.put("kiwi", "green");

        Iterator<Map.Entry<String ,String>> all=fruitMap.entrySet().iterator();
        while (all.hasNext()){
          Map.Entry<String,String>  sum =all.next();
          String keys=sum.getKey();
         String valuess= sum.getValue();

            System.out.println("keys are "+keys+" and values are "+valuess);
        }
    }
}
