package class27And28;
import java.util.*;
public class mapdemo2 {
    public static void main(String[] args) {
        Map<Integer,String>  fruit=new HashMap<>();
        fruit.put(2,"apple");
        fruit.put(6,"pineapple");
        fruit.put(4,"orange");
        fruit.put(7,"banana");
        fruit.put(3,"mango");
        fruit.put(1,"kiwi");
        System.out.println(fruit.get(4));
        System.out.println(fruit);
        //-------------------------------------------------------------------------
        Map<Integer,String>  fruit01=new LinkedHashMap<>();
        fruit01.put(1,"apple");
        fruit01.put(7,"orange");
        fruit01.put(6,"banana");
        fruit01.put(2,"mango");
        fruit01.put(5,"kiwi");
        System.out.println(fruit.get(5)); // get valuse
        System.out.println(fruit01);
        System.out.println(fruit01.containsKey(7)); // checking key is present or not
        System.out.println(fruit01.remove(5,"kangroo"));
        System.out.println(fruit01);
        //--------------------------------------------------------------------------
        Map<String,String>  fruit02=new TreeMap<>();
        fruit02.put("one","apple");
        fruit02.put("three","orange");
        fruit02.put("two","banana");
        fruit02.put("five","mango");
        fruit02.put("six","kiwi");
        System.out.println(fruit.get("two"));
        System.out.println(fruit02);

    }
}
