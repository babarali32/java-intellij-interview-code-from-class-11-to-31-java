package class26;

import java.util.ArrayList;

public class arraylistdemo1 {
    public static void main(String[] args) {
        ArrayList<fruit> food=new ArrayList<>();
        food.add(new fruit());
        food.add(new apple());
        food.add(new orange());
        for (fruit one:food
             ) {
            one.printname();
        }
    }
}
class fruit{
    public void printname(){
        System.out.println(" i am friut");
    }
}
class apple extends fruit{
    @Override
    public void printname(){
        System.out.println("i am apple");
    }
}
class orange extends fruit{
    @Override
    public void printname(){
        System.out.println("i am orange");
    }
}
