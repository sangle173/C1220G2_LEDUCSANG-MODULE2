package _10_dsa_list.practises.simple_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(14);
        myLinkedList.printList();
        System.out.println("=========================");
        myLinkedList.add(4, 17);
        myLinkedList.add(3, 128);
        myLinkedList.add(2, 171);
        myLinkedList.printList();
    }
}
