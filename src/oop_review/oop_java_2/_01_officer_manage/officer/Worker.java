package oop_review.oop_java_2._01_officer_manage.officer;

public class Worker extends Officer {
    private String level;

    public Worker() {

    }

    public Worker(String level) {
        this.level = level;
    }

    public Worker(String name, String birthDay, String gender, String address, String level) {
        super(name, birthDay, gender, address);
        this.level = level;
    }
    public Worker(String[] workerInfo){
        super(workerInfo[0],workerInfo[1],workerInfo[2],workerInfo[3]);
        this.level=workerInfo[4];
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level='" + level + '\'' +
                "} " + super.toString();
    }
}
