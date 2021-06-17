package OfficeHours.Practice_06_01_2021.ScrumTeamPractice;

public class Developer {
    /*
     create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, coding(),  fixingBug(), toString()
     */
    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;
    private static boolean hasCodingSkills;
   // private static boolean hasCodingSkills=true--- bole yazarsak, olusturdugumuz butun objectler hascodingskill true olmus olcak.

    public Developer (String name, int employeeId, String jobTitle, double salary){
        this.name=name;
        this.employeeId=employeeId;
        this.jobTitle=jobTitle;
        this.salary=salary;
       hasCodingSkills=true;

    }
    public void coding(){
        System.out.println(this.name+ " has "+hasCodingSkills);
    }
    public void fixingBug(){
        System.out.println(this.name+" can fix bugs");
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

    public boolean isHasCodingSkills() {
        return hasCodingSkills;
    }



    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasCodingSkills=" + hasCodingSkills +
                '}';
    }
}
