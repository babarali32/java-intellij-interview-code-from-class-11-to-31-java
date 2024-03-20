package class20.overriding;
public class task01 {
    //Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree
    // you need high school diploma"".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    // In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        degree one=new degree();
        one.getprerquisite();
        bachelor two=new bachelor();
        two.getprerquisite();
        master three=new master();
        three.getprerquisite();
    }

}
class degree{
    public void getprerquisite(){
        System.out.println("to get a degree you need high school diploma");
    }
}
class bachelor extends degree{}
class master extends degree{
    @Override
    public void getprerquisite(){

    }
}