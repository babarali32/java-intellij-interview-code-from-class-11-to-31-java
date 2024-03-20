package class27And28;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task033 {
    public static void main(String[] args) {
        // Create a TreeMap to store person objects with keys in ascending order
        Map<Integer, person> personMap = new TreeMap<>();

        // Adding person objects to the map
        personMap.put(1, new person("A", "x", 10, 200));
        personMap.put(2, new person("B", "y", 20, 3000));
        personMap.put(3, new person("C", "z", 30, 4000));

        // Get an iterator over the map entries
        Iterator<Map.Entry<Integer, person>> iterator = personMap.entrySet().iterator();

        // Iterate over the entries and print details of each object
        while (iterator.hasNext()) {
            Map.Entry<Integer, person> entry = iterator.next();
            int personId = entry.getKey();
            person personObj = entry.getValue();

            System.out.println("Person ID: " + personId);
            System.out.println("Details:");
            personObj.printuserdetails();
            System.out.println();
        }
    }
}

class person {
    private String name;
    private String lastname;
    private int age;
    private double salary;

    public person(String name, String lastname, int age, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public void printuserdetails() {
        System.out.println("User name: " + name);
        System.out.println("User lastname: " + lastname);
        System.out.println("User age: " + age);
        System.out.println("User salary: " + salary);
    }
}
