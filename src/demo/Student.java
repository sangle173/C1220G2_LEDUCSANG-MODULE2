package demo;

import java.util.*;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student st = ((Student) obj);
            if (st.getAge() == this.age && st.getName() == this.name) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }



    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("111", 29);
        Student student2 = new Student("111", 29);
        Student student3 = new Student("222", 28);
        System.out.println(student1.equals(student2));

        Set<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);

        for (Student student : set) {
            System.out.println(student);
        }
        System.out.println("====================");
        System.out.println(set.contains(student2));
        System.out.println("student1.hashcode() is : " + student1.hashCode());
        System.out.println("student2.hashcode() is : " + student2.hashCode());
        System.out.println("student3.hashcode() is : " + student3.hashCode());
    }
}
