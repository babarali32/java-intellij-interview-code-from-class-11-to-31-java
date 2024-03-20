package class20;
public class task04 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void call(){
        System.out.println(" empty");
    }
    private void call(int a){
        System.out.println(a);
    }
    private void call(int a, int b){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        task04 obj=new task04();
        obj.call();
        obj.call(2);
        obj.call(2,4);

    }
}

