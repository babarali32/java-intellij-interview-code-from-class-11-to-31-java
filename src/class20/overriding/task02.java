package class20.overriding;

public class task02 {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard();
        obj1.calculateInterest(3700);
        Visa obj2 = new Visa();
        obj2.calculateInterest(600);
        AX obj3 = new AX();
        obj3.calculateInterest(900);
    }
}

class CreditCard {
    public double balance;
    public double interest;

    public void calculateInterest(double balance) {
        double total = balance * 0.02;
        System.out.println("The interest that has been charged on your balance is Rs= " + total);
    }
}

class Visa extends CreditCard {
}

class AX extends CreditCard {
    @Override
    public void calculateInterest(double balance) {
        double total = balance * 0.03; // Assuming AX has different interest rate
        System.out.println("The interest that has been charged on your balance is Rs= " + total);
    }
}
