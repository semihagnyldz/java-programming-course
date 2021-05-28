package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app="etsy";
        String zones= "us-east-1,us-west-2,us-west-1";

        System.out.println("---- Starting deployment of etsy app to AWS zones ----");
        //how to seperateyly print zone 1,2,3
        String[] zonesToDeploy= zones.split(",");
        for(String eachZones:zonesToDeploy) {


            System.out.println(eachZones);
        }
    }
}
