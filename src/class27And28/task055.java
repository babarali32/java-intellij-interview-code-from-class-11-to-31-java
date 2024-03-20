package class27And28;
import java.util.LinkedHashSet;
public class task055 {
    public static void main(String[] args) {

        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        // Add strings to the set
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");
        stringSet.add("is");
        stringSet.add("awesome");
        StringBuilder cocat=new StringBuilder();
        for (String str:stringSet){
            String all=cocat.append(str).toString();
            System.out.println(all);

        }
    }
}
