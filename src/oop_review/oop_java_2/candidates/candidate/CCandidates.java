package oop_review.oop_java_2.candidates.candidate;

public class CCandidates extends Candidates implements Subject {
    private String subject1, subject2, subject3;

    public CCandidates(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public CCandidates() {
    }

    public CCandidates(String identificationNumber, String name, String address, String priority, String subject1, String subject2, String subject3) {
        super(identificationNumber, name, address, priority);
        this.subject1 = LITERATURE;
        this.subject2 = HISTORY;
        this.subject3 = GEOGRAPHY;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                subject1 + "," +
                subject2 + "," +
                subject3;
    }


    @Override
    public String showInfo() {
        return "C_Candidates{" +
                "identificationNumber='" + super.getIdentificationNumber() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priority='" + super.getPriority() + '\'' +
                "  subject1='" + subject1 + '\'' +
                ", subject2='" + subject2 + '\'' +
                ", subject3='" + subject3 + '\'' +
                "} ";
    }
}
