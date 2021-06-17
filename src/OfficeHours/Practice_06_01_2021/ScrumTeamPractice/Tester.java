package OfficeHours.Practice_06_01_2021.ScrumTeamPractice;

public class Tester {
    /*
    create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, smokeTesting(),  creatingTicket(), toString()

            -> Optional: static variable
     */
    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;
    //above all instance variables, not local

    public Tester(String name, int employeeId, String jobTitle, double salary){//purpose of the constructor:
        this.name= name;
        this.employeeId=employeeId;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(this.name+" is running a smoke test");
    }
    public void createTicket(){
        System.out.println(this.name+" is running a ticket");

    }
}
