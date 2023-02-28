package Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorter {

    public static void main(String[] args) {

        //call the get employee method
        List<Employee> employeeList = getEmployee();

        //display the list before sort
        System.out.println("=== BEFORE SORT===");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        //sort by name, using java 8, here no more using Collections.sor instead will use list.sort
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("===AFTER SORT===");
        System.out.println("Sorted by Name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        //Similarly , we can sort by age
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("Sorted by Age:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    private static List<Employee> getEmployee() {
        //init employee object
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith", "50000", 31));
        employees.add(new Employee("Alex", "10000", 22));
        employees.add(new Employee("Tom", "30000", 44));
        employees.add(new Employee("John", "22000", 55));

        return employees;

    }
}
