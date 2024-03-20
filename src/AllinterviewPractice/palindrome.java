package AllinterviewPractice;

public class palindrome {
    public static void main(String[] args) {
        String name="pakistan";
        StringBuilder obj=new StringBuilder(name);
        String reversed=obj.reverse().toString();
        if (reversed.equalsIgnoreCase(name)){
            System.out.println(name+" = word is palindome");
        } else {
            System.out.println(" not palindrome your word");
        }
    }
}
