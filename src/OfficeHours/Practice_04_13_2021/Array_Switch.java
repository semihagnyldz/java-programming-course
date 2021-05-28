package OfficeHours.Practice_04_13_2021;

public class Array_Switch {
    public static void main(String[] args) { //FOR PRACTICE: bunda break koymadan debug yap!
        int [] arr= {1,2,3};
        for (int each: arr){
            switch (each){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
            }
        }
    }
}
