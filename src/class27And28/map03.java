package class27And28;
import java.util.HashMap;
import java.util.Map;
public class map03 {
    public static void main(String[] args) {
        Map<Integer,String> fruit=new HashMap<>();
        fruit.put(2,"apple");
        fruit.put(6,"pineapple");
        fruit.put(4,"orange");
        fruit.put(7,"banana");
        fruit.put(3,"mango");
        fruit.put(1,"kiwi");
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty()+"is not empty");
        System.out.println(fruit);
        fruit.replace(7,"kangrooes");
        System.out.println(fruit);
    }
}
