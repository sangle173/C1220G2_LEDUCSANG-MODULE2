package oop_review.oop_java_2._02_book_manager.document;

public class Magazine extends Document {
    private int noOfPublish;
    private String monthOfPublish;

    public Magazine() {
    }

    public Magazine(int noOfPublish, String monthOfPublish) {
        this.noOfPublish = noOfPublish;
        this.monthOfPublish = monthOfPublish;
    }

    public Magazine(String noOfNumber, String producerName, int publishNumber, int noOfPublish, String monthOfPublish) {
        super(noOfNumber, producerName, publishNumber);
        this.noOfPublish = noOfPublish;
        this.monthOfPublish = monthOfPublish;
    }
    public Magazine(String[] magazineInfo){
        super(magazineInfo[0], magazineInfo[1], Integer.parseInt(magazineInfo[2]));
        this.noOfPublish=Integer.parseInt(magazineInfo[3]);
        this.monthOfPublish=magazineInfo[4];
    }

    public int getNoOfPublish() {
        return noOfPublish;
    }

    public void setNoOfPublish(int noOfPublish) {
        this.noOfPublish = noOfPublish;
    }

    public String getMonthOfPublish() {
        return monthOfPublish;
    }

    public void setMonthOfPublish(String monthOfPublish) {
        this.monthOfPublish = monthOfPublish;
    }

    @Override
    public String toString() {
        return super.toString()+","+
                noOfPublish+","+
                monthOfPublish;
    }

    @Override
    public String showInfo() {
        return "Magazines{" +
                "noOfNumber='" + super.getNoOfNumber() + '\'' +
                ", producerName='" + super.getProducerName() + '\'' +
                ", publishNumber='" + super.getPublishNumber() + '\'' +
                ", noOfPublish='" +noOfPublish + '\'' +
                ", monthOfPublish='" + monthOfPublish + '\'' +
                "} ";
    }
}
