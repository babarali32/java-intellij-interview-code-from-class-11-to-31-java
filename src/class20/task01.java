package class20;
public class task01 {
    //Create 1 class in which create a methods
    // that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //Use separate class to test your code
    public void calculatearea(double lenght, double width){
        System.out.println(lenght*width);

    }
    public void calculatearea(double lenght, double width, double hight){
        System.out.println(lenght*width*hight);

    }
    public void varmethod(double ... value){
        double num=0;
        for (double number:value
             ) {
            num+=number*number;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        task01 obj=new task01();
        obj.calculatearea(12,23);
    }
}
