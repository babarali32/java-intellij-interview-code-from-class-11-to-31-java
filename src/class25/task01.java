package class25;

import java.util.ArrayList;

public class task01 {
    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("A");
        names.add("E");
        names.add("i");
        names.add("O");
        names.add("U");
        names.isEmpty();
        System.out.println(names.isEmpty());
        names.contains("E");
        System.out.println(names.contains("U"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
