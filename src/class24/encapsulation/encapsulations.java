package class24.encapsulation;
public class encapsulations {
    private String username;
    private String password;
    private String balance;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
}
class Tester{
    public static void main(String[] args) {

        encapsulations obj=new encapsulations();
        obj.setUsername("lahore");
        obj.getUsername();
        obj.setPassword("123");
        obj.getPassword();
        obj.setBalance("Rs=242524");
        obj.getBalance();
        System.out.println( "if you add this username = "+obj.getUsername());
        System.out.println("if you add this password = "+obj.getPassword());
        System.out.println( "your balance is "+obj.getBalance());

    }
}
