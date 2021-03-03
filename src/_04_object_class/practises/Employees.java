package _04_object_class.practises;

import java.util.Scanner;

public class Employees {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employees(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return lastName + firstName;
    }

    public String displayEmployee() {
        return "Employees{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id ");
        int id = scanner.nextInt();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter salary");
        int salary=scanner.nextInt();
        Employees employees=new Employees(id, lastName, firstName, salary);
        System.out.println("Employee infor "+employees.displayEmployee());
        System.out.println("Employee annual salary "+employees.getAnnualSalary());
    }
}
