package oop_review.oop_java_2._03_candidates.candidate;

public abstract class Candidates {
    private String identificationNumber, name, address, priority;

    public Candidates() {

    }

    public Candidates(String identificationNumber, String name, String address, String priority) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return identificationNumber + "," +
                name + "," +
                address + "," +
                priority;
    }
    public abstract String showInfo();

}
