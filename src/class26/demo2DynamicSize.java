package class26;

import java.util.ArrayList;

public class demo2DynamicSize {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>();
        word.add("one");
        word.add("two");
        word.add("three");
        word.add("four");
        word.add("five");
        word.add("six");
        word.add("seven");
        word.add("eight");
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).length()>4){
                word.remove(i);
            }

        }
        System.out.println(word);
    }
}
