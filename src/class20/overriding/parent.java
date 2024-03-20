package class20.overriding;
public class parent {
        String name;
        void printname(){
            System.out.println("my name is "+name);
        }
        void getmarry(){
            System.out.println(" get marry with his own choice");
        }
}
class child extends parent{
    @Override
      void printname(){
        System.out.println(" name is changed"+name);
    }
    @Override
     void getmarry(){
        super.getmarry();
        System.out.println(" i need my chois and also your choice ");
    }

    public static void main(String[] args) {
        child obj=new child();
        obj.getmarry();
    }
}
