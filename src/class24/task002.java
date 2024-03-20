package class24;
public class task002 {
    //We have to calculate the average of marks obtained in three subjects
    // by student A and in 4 subjects by student B. Create class 'Marks' with
    // an abstract method 'getAverage' that will be returning the average of marks.
    // Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
    // in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
    public static void main(String[] args) {
        marks obj=new x(42,53,64);
        obj.getaverage();
        System.out.println("the average marks of three subjects are "+obj.getaverage());
        marks obj3=new y(55,34,26.3,66);
        obj3.getaverage();
        System.out.println("the averge marks of four subjects are "+obj3.getaverage());
    }
}
abstract class marks{
    public abstract double getaverage();
}
class x extends marks {
    private double physics;
    private double chemisty;
    private double  bio;
    public x(double physics, double chemisty, double bio) {
        this.physics = physics;
        this.chemisty = chemisty;
        this.bio = bio;
    }


    @Override
    public double getaverage() {
        return physics+chemisty+bio/3;
    }
}
class y extends marks{
    private double physics;
    private double chemisty;
    private double  bio;
    private double math;

    public y(double physics, double chemisty, double bio, double math) {
        this.physics = physics;
        this.chemisty = chemisty;
        this.bio = bio;
        this.math = math;
    }

    @Override
    public double getaverage() {
        return physics+chemisty+bio+math/4;
    }
}