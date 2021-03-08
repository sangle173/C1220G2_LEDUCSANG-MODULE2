package oop_review.oop_java_2._02_book_manager.document;

import java.io.Serializable;

public class Book extends Document {
    private String authorName;
    private int noOfPage;

    public Book(String authorName, int noOfPage) {
        this.authorName = authorName;
        this.noOfPage = noOfPage;
    }

    public Book(String noOfNumber, String producerName, int publishNumber, String authorName, int noOfPage) {
        super(noOfNumber, producerName, publishNumber);
        this.authorName = authorName;
        this.noOfPage = noOfPage;
    }

    public Book(String[] bookInfo) {
        super(bookInfo[0], bookInfo[1], Integer.parseInt(bookInfo[2]));
        this.authorName = bookInfo[3];
        this.noOfPage = Integer.parseInt(bookInfo[4]);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNoOfPage() {
        return noOfPage;
    }

    public void setNoOfPage(int noOfPage) {
        this.noOfPage = noOfPage;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                authorName + "," +
                noOfPage;
    }

    @Override
    public String showInfo() {
        return "Book{" +
                ", noOfNumber='" + super.getNoOfNumber() + '\'' +
                ", producerName='" + super.getProducerName() + '\'' +
                ", publishNumber='" + super.getPublishNumber() + '\'' +
                ", authorName='" + authorName + '\'' +
                ", noOfPage=" + noOfPage +
                "} ";
    }
}
