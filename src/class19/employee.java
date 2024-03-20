package class19;
public class employee {
    String name;
    public employee() {
        System.out.println(" i am parent class constructor but called in child class");
    }

    int bassalary=3000;
    int baseNoDays=26;
    public void printbasesalary(){
        System.out.println(bassalary);
    }
   public void printDays(){}
}
class manager extends employee{
    manager() {
        super(); // Call the constructor of the superclass
        System.out.println("I am child class constructor");
    }
    int basesalary=5000;
    int bonus=10;
    int travelaalownce=200;
    public void printbasesalary(){
        super.printbasesalary();
        System.out.println(bonus+travelaalownce+super.bassalary);
    }
}
