package _11_dsa_stack_queue.exercises.queue;

public class Solution {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;

        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        enQueue(queue, 14);
        enQueue(queue, 22);
        enQueue(queue, 6);
        displayQueue(queue);
        System.out.println();
        System.out.println("Deleted value = " + deQueue(queue));
        System.out.println("Deleted value = " + deQueue(queue));

    }
}
