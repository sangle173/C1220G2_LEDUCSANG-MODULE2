package oop_review.oop_java_2._02_book_manager.document;

public class Newspapers extends Document {
    private String dayOfPublish;

    public Newspapers() {
    }

    public Newspapers(String dayOfPublish) {
        this.dayOfPublish = dayOfPublish;
    }

    public Newspapers(String noOfNumber, String producerName, int publishNumber, String dayOfPublish) {
        super(noOfNumber, producerName, publishNumber);
        this.dayOfPublish = dayOfPublish;
    }

    public String getDayOfPublish() {
        return dayOfPublish;
    }

    public void setDayOfPublish(String dayOfPublish) {
        this.dayOfPublish = dayOfPublish;
    }

    @Override
    public String toString() {
        return super.toString()+","+
                dayOfPublish;
    }

    @Override
    public String showInfo() {
        return "Newspaper{" +
                ", noOfNumber='" + super.getNoOfNumber() + '\'' +
                ", producerName='" + super.getProducerName() + '\'' +
                ", publishNumber='" + super.getPublishNumber() + '\'' +
                ", authorName='" + dayOfPublish + '\'' +
                "} ";
    }
}
