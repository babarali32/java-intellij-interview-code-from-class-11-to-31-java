package class25;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println(numbers.size());
        numbers.add(23);
        numbers.add(32);
        numbers.add(53);
        System.out.println(numbers.size());
        numbers.remove(1);
        System.out.println(numbers.size());

        System.out.println( numbers.indexOf(23));




    }
}
