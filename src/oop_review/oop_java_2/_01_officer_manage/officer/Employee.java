package oop_review.oop_java_2._01_officer_manage.officer;

public class Employee extends Officer{
    private String employment;

    public Employee() {
    }

    public Employee(String employment) {
        this.employment = employment;
    }

    public Employee(String name, String birthDay, String gender, String address, String employment) {
        super(name, birthDay, gender, address);
        this.employment = employment;
    }
    public Employee(String[] employeeInfo){
        super(employeeInfo[0],employeeInfo[1],employeeInfo[2],employeeInfo[3]);
        this.employment=employeeInfo[4];
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employment='" + employment + '\'' +
                "} " + super.toString();
    }
}
