package me.petrolingus.task01.task0103;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(100, "Alex", "Turner", 12900);
        System.out.println(employee);

        System.out.println("emp id: " + employee.getId());
        System.out.println("emp firstName: " + employee.getFirstName());
        System.out.println("emp lastName: " + employee.getLastName());
        System.out.println("emp salary: " + employee.getSalary());
        System.out.println("emp annual salary: " + employee.getAnnualSalary() + "\n");

        int newSalary = employee.getSalary() / 2;
        System.out.println("Set new salary");
        employee.setSalary(newSalary);
        System.out.println("emp salary: " + employee.getSalary() + "\n");

        System.out.println("Make a salary 100");
        employee.setSalary(100);
        System.out.println("emp salary: " + employee.getSalary());
        System.out.println("raiseSalary(24)");
        employee.raiseSalary(24);
        System.out.println("emp salary: " + employee.getSalary());
    }
}
