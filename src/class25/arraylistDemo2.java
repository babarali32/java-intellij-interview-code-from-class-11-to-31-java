package class25;

import java.util.ArrayList;

public class arraylistDemo2 {

    public static void main(String[] args) {

        ArrayList<String> word=new ArrayList<>();
        word.add("one");
        word.add("two");
        word.add("three");
        System.out.println(word);
        word.remove(1);
       // word.clear();
        System.out.println(word);
//        ArrayList<String> str=new ArrayList<>();
//       str.add("one");
//       str.add("two");
//       str.add("three");
//        ArrayList<String> combine=new ArrayList<>();
//        combine.addAll(word);
//        combine.addAll(str);
//        System.out.println(combine);
//        word.clear();
//        System.out.println(combine);


    }

}
