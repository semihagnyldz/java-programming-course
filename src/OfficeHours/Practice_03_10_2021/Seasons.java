package OfficeHours.Practice_03_10_2021;
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the season number: \n1-Spring\n2-Summer\n3-Fall\n4-Winter");
        int season= scan.nextInt();
        int day=0;//here we are initialing the value here value is day=0 int variable. and then in if statement you reassign the value.
        int night=0;
        String seasonName= ""; //this is default value.

        if(season==1){ // here we are using if conditions and assigning some values.
            day=14;
            night=10;
            seasonName="Spring";
            //System.out.println("");

        }
        if(season==2){
            day= 16;
            night=8;
            seasonName="Summer";

            //System.out.println("It is Summer");
        }
        if(season==3){
            day=14;
            night=10;
            seasonName="Fall";
            //System.out.println("It is Fall");
        }
        if(season==4){
            day=12;
            night=12;
            seasonName="Winter";

        }
        System.out.println("In "+seasonName+ " there is "+ day+ " hours of daylight and "+night+ " hours of nighttime");

    }
}
