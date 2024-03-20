package class23;

public class Testerphone {
    public static void main(String[] args) {
        phone obj=new iphone();
        obj.displaypic();
        obj.makephoncalls();
        obj.sendText();

        phone obj2=new oppo();
        obj2.makephoncalls();
        obj2.sendText();
        obj2.unlockphone();


    }
}
