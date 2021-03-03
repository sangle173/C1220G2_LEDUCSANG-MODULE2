package _04_object_class.exercises;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    //phương thức bắt đầu
    public void start() {
        this.startTime = new Date();
    }

    // phương thức dừng
    public void stop() {
        this.endTime = new Date();
    }

    // phương thức trả về thời gian đêm được
    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    // tạo mảng bằng Math.randoom
    public static int[] randomArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int numberOfElement = in.nextInt();

        int[] arr = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        // bắt đầu
        stopWatch.start();
        int[] arr = randomArray();
        //kết thúc
        stopWatch.stop();

        System.out.println("The time for process: " + stopWatch.getElapsedTime() + "ms");
    }
}
