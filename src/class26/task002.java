package class26;

import java.util.TreeSet;

public class task002 {
    public static void main(String[] args) {
        //Create a Set collection in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.
        TreeSet<String> countries=new TreeSet<>();
        countries.add("india");
        countries.add("pakistan");
        countries.add("ireland");
        countries.add("austrailia");
        countries.add("finland");
        System.out.println(countries);
        for (String elemnt:countries
             ) {
            System.out.println(elemnt);
        }

    }
}
