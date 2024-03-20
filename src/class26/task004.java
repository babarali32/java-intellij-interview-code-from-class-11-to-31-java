package class26;

import java.util.HashSet;

public class task004 {
    //Create a Set collection that will hold Objects of Student Type.
    // In this set we do not care about the insertion order.
    // Each student object should have name and studentID. Display name of each student.
    public static void main(String[] args) {
       HashSet<student> obj=new HashSet<>();
        // Add Student objects to the HashSet
        obj.add(new student("John", 101));
        obj.add(new student("Alice", 102));
        obj.add(new student("Bob", 103));
        for (student num:obj
             ) {
            num.getname();
        }
    }
}
class student{
    private String name;
    public int id;
    public student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public void getname(){
        System.out.println(name);
    }
}
