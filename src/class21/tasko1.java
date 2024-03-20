package class21;

public class tasko1 {
    //Create a Class Student that will have 3 subclasses
    // as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override
    // some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism
    public static void main(String[] args) {
        mainn obj=new college();
        obj.uniform();
        mainn obj2=new school();
        obj2.uniform();
        mainn obj3=new syntasstrudents();
        obj3.uniform();
        mainn [] one={new syntasstrudents(),new school(),new college()};
        for (mainn two:one
             ) {
            two.uniform();
            two.studybooks();
        }
    }

}
class mainn{
    public void uniform(){
        System.out.println("main class students wear uniform");
    }
    public void studybooks(){
        System.out.println(" study books");
    }
}
class syntasstrudents extends mainn{
    @Override
    public void uniform(){
        System.out.println(" syntacx students wear uniform");
    }
}
class college extends mainn{}
class school extends mainn{}