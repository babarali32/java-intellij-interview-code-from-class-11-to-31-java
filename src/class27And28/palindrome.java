package class27And28;

public class palindrome {
    public static void main(String[] args) {

        String word = "level";
        String word2="radar";

        StringBuilder obj = new StringBuilder(word);
         String storedRev= obj.reverse().toString();

        if (storedRev.equalsIgnoreCase(word)) {
            System.out.println("Word is a palindrome.");
        } else {
            System.out.println("Word is not a palindrome.");
        }

    }
}
