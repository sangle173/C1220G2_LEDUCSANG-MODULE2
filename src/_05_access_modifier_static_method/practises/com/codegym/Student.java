package _05_access_modifier_static_method.practises.com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // contructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // change value of static var
    static void change() {
        college = "CODEGYM";
    }

    // method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
