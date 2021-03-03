package _11_dsa_stac_queue.optional.practises;

import java.util.Arrays;

public class MyStack {
    private int size;
    private int arr[];
    private int index = 0;

    public MyStack(int size){
        this.size=size;
        arr=new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index]=element;
        index++;
    }
    public int  pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is full");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isFull(){
        if (index==size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                ", index=" + index +
                '}';
    }
}
