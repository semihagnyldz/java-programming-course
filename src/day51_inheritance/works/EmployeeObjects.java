package day51_inheritance.works;

import day51_inheritance.works.Constractor;
import day51_inheritance.works.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer= new Employee();
        developer.jobTitle="Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        System.out.println("developer.toString() = " + developer.toString());
        System.out.println("developer:"+ developer);

        Constractor sdetContractor= new Constractor();
        sdetContractor.jobTitle= "SDET";
        /*
        System.out.println("sdetContractor.calculateSalary(55) = " + sdetContractor.calculateSalary(55));
        System.out.println("sdetconstructor: "+sdetContractor);

         */
        sdetContractor.calculateSalary(55);
        System.out.println(sdetContractor);



    }
}
