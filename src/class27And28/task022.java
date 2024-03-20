package class27And28;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class task022 {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer,String> bestBuyStore=new HashMap<>();
        bestBuyStore.put(100,"lcd");
        bestBuyStore.put(500,"washing machine");
        bestBuyStore.put(300,"chairs");
        bestBuyStore.put(200,"juicer machine");
        bestBuyStore.put(400,"steel box");
        Iterator<Map.Entry<Integer,String>> val =bestBuyStore.entrySet().iterator();
        while (val.hasNext()){
            Map.Entry<Integer,String> one=val.next();
           int v1=one.getKey();
            String v2=one.getValue();
            System.out.println(v1+" and values are = "+v2);
        }

    }
}
