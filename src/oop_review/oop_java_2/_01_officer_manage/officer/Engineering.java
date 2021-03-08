package oop_review.oop_java_2._01_officer_manage.officer;

public class Engineering extends Officer {
    private String trainingIndustry;

    public Engineering() {
    }

    public Engineering(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public Engineering(String name, String birthDay, String gender, String address, String trainingIndustry) {
        super(name, birthDay, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public Engineering(String[] engineeringInfo) {
        super(engineeringInfo[0], engineeringInfo[1], engineeringInfo[2], engineeringInfo[3]);
        this.trainingIndustry = engineeringInfo[4];
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "Engineering{" +
                "trainingIndustry='" + trainingIndustry + '\'' +
                "} " + super.toString();
    }
}
