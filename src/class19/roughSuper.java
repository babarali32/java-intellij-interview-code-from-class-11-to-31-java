package class19;
public class roughSuper {
    public static void main(String[] args) {
        dog obj=new dog("perfect");
        obj.getname();
    }
}
class animal {
    String name;
    public animal(String name) {
        this.name = name;
    }
    public void getname(){
        System.out.println(name);
    }
}
class dog extends animal{
    String name;
    public dog(String name) {
        super(name);
    }
}