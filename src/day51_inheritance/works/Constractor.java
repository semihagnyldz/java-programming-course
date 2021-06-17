package day51_inheritance.works;

public class Constractor extends Employee {
    public double calculateSalary(double hourlyRate){
        return 50*40*hourlyRate;
    }

    @Override
    public String toString() {
        return "Constractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
