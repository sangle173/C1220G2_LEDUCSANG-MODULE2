package _12_collection_framework.practises.comparable_and_comparator;

import _12_collection_framework.practises.Student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
