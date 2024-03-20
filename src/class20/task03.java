package class20;
public class task03 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static public void print(String name){
        System.out.println(name);
    }
    static public void print(String name, String color){
        System.out.println(name+" "+color);
    }
    static public void print(String name,String color , String age){
        System.out.println(name+" "+color+" "+age);
    }

    public static void main(String[] args) {
        task03 obj=new task03();
        obj.print("lahore");
        obj.print("lahore","black");
        obj.print("lahore","white","23 years");
    }
}
