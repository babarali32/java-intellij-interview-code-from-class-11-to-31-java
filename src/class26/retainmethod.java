package class26;

import java.util.ArrayList;

public class retainmethod {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>();
        word.add("one");
        word.add("two");
        word.add("three");
        word.add("four");
        word.add("five");
        word.add("six");

        ArrayList<String> sentence=new ArrayList<>();
        sentence.add("six");
        sentence.add("five");
        sentence.add("four");


        sentence.add("seven");
        sentence.add("eight");
        sentence.retainAll(word);
        System.out.println(sentence);;
        word.retainAll(sentence);
        System.out.println(word);

    }
}
