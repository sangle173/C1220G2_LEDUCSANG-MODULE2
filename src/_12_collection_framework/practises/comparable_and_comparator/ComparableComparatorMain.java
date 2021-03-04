package _12_collection_framework.practises.comparable_and_comparator;

import _12_collection_framework.practises.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorMain {
    public static void main(String[] args) {
        Student student1 = new Student("Sang", 29, "Nguyen Hoang");
        Student student2 = new Student("Kien", 24, "Tran Cao Van");
        Student student3 = new Student("Tung", 31, "Hoa Khanh");
        Student student4 = new Student("Hau", 25, "Hoa Tien");
        List<Student> lists = new ArrayList<>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        for (Student student : lists) {
            System.out.println(student.toString());
        }

        System.out.println("----------------");
        AgeComparator ageComparators = new AgeComparator();
        Collections.sort(lists, ageComparators);
        System.out.println("Sort with age");
        for (Student student : lists) {
            System.out.println(student.toString());
        }
    }
}
