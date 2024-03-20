package class17;
public class BestExamplConstructor {
    String username;
    String password;
    public BestExamplConstructor(String username,String password){
        this.username=username;
        this.password=password;
        System.out.println(" the balance of your account is Rs=9800");
        // you can also use methods here
    }

    public static void main(String[] args) {
        BestExamplConstructor obj=new BestExamplConstructor("admin","pass123");
    }
}
