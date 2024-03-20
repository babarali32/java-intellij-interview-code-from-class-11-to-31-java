package AllinterviewPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("two");
        arrayList.add("two");
        arrayList.add("four");
        arrayList.add("two");
        Set<String> remove=new LinkedHashSet<>(arrayList);
        System.out.println(remove);
    }
}
