package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month=1;
        if(month==12 || month==1|| month==2){
            System.out.println("Winter");
        }else if(month==3 || month==4 || month==5){
            System.out.println("Spring");
        }else if(month==6|| month==7 || month==8){
            System.out.println("Summer");
        }else{
            System.out.println("Fall");
        }
        //with switch:
        switch(month) {
            case 12:
                System.out.println("winter");
                break;
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                //but switch is longer than if.
                //case 12: case 1: case 2:
            /*
        Winter: 12,1,2
Spring: 3,4,5
Summer: 6,7,8
Fall:   9,10,11

when month = 2;
    OUTPUT:
        "Winter"

when month = 7;
    OUTPUT:
        "Summer"
----------------------

Winter: 12,1,2

int month = 1;
if(month == 12 || month == 1 || month == 2) {
    System.out.println("Winter");
}

switch(month) {
    case 12:
    case 1:
    case 2:
        System.out.println("Winter");
        break;
}
         */
        }
    }
}
