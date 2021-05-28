package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        // first object:
        Employee employee1 = new Employee();//creating an instance of a Employee class.
        employee1.name = "semiha";
        employee1.jobTitle = "research assistant";
        employee1.work();

        //2nd object:
        Employee employee2 = new Employee();
        employee2.name = "hafsa";
        employee2.jobTitle = "student";
        employee2.work();

        //3rd object:
        Employee employee3 = new Employee();
        employee3.name = "meliha";
        employee3.jobTitle = "studenttt";
        employee3.work();

        //summary
        //work method yani behavior uses name and jobtitle as DATA

    }
}
