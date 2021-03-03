package _11_dsa_stac_queue.optional.practises;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue(6);
        queue.enqueque(4);
        queue.dequeue();
        queue.enqueque(4);
        queue.enqueque(5);
        queue.enqueque(6);
        queue.enqueque(7);
        queue.enqueque(8);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
