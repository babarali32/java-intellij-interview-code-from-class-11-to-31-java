package class19;
public class superTask01 {
    //Write program: userClass  that has a constructor
    // that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and
    // it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    public static void main(String[] args) {
        userinfo obj=new userinfo("lahore","030343535","street A block 5");
        obj.usermethod();
    }
}
class userclass{
    String name;
    String mobilenumber;
    public userclass(String name, String mobilenumber) {
        this.name = name;
        this.mobilenumber = mobilenumber;
    }
}
class userinfo extends  userclass{
    String useraddress;
    public userinfo(String name, String mobilenumber, String useraddress) {
        super(name, mobilenumber);
        this.useraddress = useraddress;
    }

    public void usermethod(){
        System.out.println(name+" mobile number "+mobilenumber+" address of user "+useraddress);
    }
}
