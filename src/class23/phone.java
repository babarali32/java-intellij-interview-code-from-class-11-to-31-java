package class23;

public abstract class phone {
    public void makephoncalls(){
        System.out.println(" making calls");
    }
    public void sendText(){
        System.out.println(" sending text");
    }
    public abstract void displaypic();
    public abstract void unlockphone();
}
class iphone extends phone{
    @Override
    public void displaypic(){
        System.out.println("use photo gallery to see pic ");
    }
    @Override
    public void unlockphone(){
        System.out.println(" use password to unlock the phone");
      }
    }
class oppo extends phone{
    @Override
    public void displaypic(){
        System.out.println("use filemanager gallery to see pic ");
    }
    @Override
    public void unlockphone(){
        System.out.println(" use fingerprint to unlock the phone");
    }

}
