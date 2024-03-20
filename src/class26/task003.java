package class26;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class task003 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("lahore");
        city.add("multan");
        city.add("Akasur");
        city.add("sialkot");
        city.add("Armanan");
       Iterator<String>  names= city.iterator();
       while (names.hasNext()){
           String val=names.next();
           if (val.toLowerCase().startsWith("a")){
               names.remove();
           }
       }
        System.out.println(city);
        }
    }

