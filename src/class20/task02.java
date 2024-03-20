package class20;
public class task02 {
    //Create a class named 'Programming'. While creating an object of the class,
    // if nothing is passed to it, then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages"
    // the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
}
class programming{
    public programming(){
        System.out.println(" i love programming ");
    }
    public programming(String lang){
        System.out.println(" i love "+lang);
    }

    public static void main(String[] args) {
        programming obj=new programming();
        programming ob2=new programming("java");

    }
}