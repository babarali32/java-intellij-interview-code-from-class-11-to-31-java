package class26;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratordemo {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>();
        word.add("first");
        word.add("second");
        word.add("third");
        word.add("four");
        word.add("five");


//        word.iterator();
        Iterator<String> iterator= word.iterator();
//
//        iterator.hasNext();
//        System.out.println("-------------");
//        iterator.next();
//        System.out.println("-------------");
//
//        System.out.println(iterator.next());

        while (iterator.hasNext()){
            String all=iterator.next();
            if ((all.length()>4)){
                iterator.remove();
            }
        }
        System.out.println(word);




    }
}
