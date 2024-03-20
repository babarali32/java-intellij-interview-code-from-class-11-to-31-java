    package AllinterviewPractice;

    public class reverseString {
    public static void main(String[] args) {
        //write a programe revese the string word by word don't change position
        String str="my name is babar ali";
        String [] arr =str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder obj=new StringBuilder(str);
            String val=obj.reverse().toString();
        }
        System.out.println(str);
    }
}
