package _10_dsa_list.exercises;

public class ArrayListTest {
    public static <E> void main(String[] args) {
        MyArrayMyList<String> myArrayList =new MyArrayMyList<>();
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D",2);
        System.out.println(myArrayList);
        System.out.println(myArrayList);
        myArrayList.remove(2);
        System.out.println(myArrayList);
        System.out.println(myArrayList.indexOf("B"));
        System.out.println(myArrayList);
    }
}
