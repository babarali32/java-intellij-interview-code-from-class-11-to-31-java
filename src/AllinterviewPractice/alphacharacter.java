package AllinterviewPractice;

public class alphacharacter {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string? Find the number of
        //words in a string?
        String str="I @%@@am Here %(34)@(#*2to Present the Pakistan";
        
        String one=str.replaceAll("[^A-z]","-");
        System.out.println(one);
        System.out.println(one.length());
            String [] arr= str.split(" ");
        System.out.println(arr.length);

    }
}
