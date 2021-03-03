package _05_access_modifier_static_method.practises.com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        // call change method
        Student.change();
        //creating  object
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(112, "Sang");
        Student s3 = new Student(113, "Kha");
        //call display
        s1.display();
        s2.display();
        s3.display();
    }
}
