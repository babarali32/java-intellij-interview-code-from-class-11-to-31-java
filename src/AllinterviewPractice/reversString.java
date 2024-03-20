package AllinterviewPractice;

public class reversString {
    public static void main(String[] args) {
        String str="today is sunday , i am happy.";
        String [] arr=str.split(" ");
        StringBuilder obj=new StringBuilder();
        for (int i = arr.length; i >0 ; i--) {
            obj.append(arr);
            String reversed=obj.reverse().toString();

            System.out.println(reversed);
        }
    }
}
