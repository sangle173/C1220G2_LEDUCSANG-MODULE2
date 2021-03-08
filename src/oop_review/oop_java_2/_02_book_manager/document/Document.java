package oop_review.oop_java_2._02_book_manager.document;

public abstract class Document {
    private String noOfNumber;
    private String producerName;
    private int publishNumber;

    public Document() {

    }

    public Document(String noOfNumber, String producerName, int publishNumber) {
        this.noOfNumber = noOfNumber;
        this.producerName = producerName;
        this.publishNumber = publishNumber;
    }

    public String getNoOfNumber() {
        return noOfNumber;
    }

    public void setNoOfNumber(String noOfNumber) {
        this.noOfNumber = noOfNumber;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getPublishNumber() {
        return publishNumber;
    }

    public void setPublishNumber(int publishNumber) {
        this.publishNumber = publishNumber;
    }

    @Override
    public String toString() {
        return noOfNumber + "," +
                producerName + "," +
                publishNumber;
    }

    public abstract String showInfo();
}
