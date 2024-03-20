package class27And28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task044 {
    public static void main(String[] args) {
        // Create a Map that will store Employee name and salary
        Map<String, Integer> employee = new HashMap<>();
        employee.put("A", 200);
        employee.put("B", 400);
        employee.put("C", 100);
        employee.put("D", 500);
        employee.put("E", 250);

        String highestEmployee = null;
        int highestSalary = Integer.MIN_VALUE;

        Iterator<Map.Entry<String, Integer>> iterator = employee.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String currentEmployee = entry.getKey();
            int currentSalary = entry.getValue();
            if (currentSalary > highestSalary) {
                highestSalary = currentSalary;
                highestEmployee = currentEmployee;
            }
        }

        if (highestEmployee != null) {
            System.out.println(highestEmployee + "=$" + highestSalary);
        } else {
            System.out.println("No employees found.");
        }
    }
}
