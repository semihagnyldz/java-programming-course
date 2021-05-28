package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getdayNameV2(6)); //it is going to jump to day 6 and breaks the switch. not whole method.
        System.out.println(getDayName(0));
        for(int i=0; i<8; i++){
            System.out.println(getDayName(i));
        }
        String today= getDayName(3);
        System.out.println(today);
        String someDay= getDayName(0);
        if(someDay==null){
            System.out.println("someday is null for invalid day");

        }



    }
    public static String getDayName(int day){ //int day ..bu metodun ne accept edecegi, sayi accept etcek, oyuzden int, yazi accept etseydi string.
        switch (day) {
            case 1: return "monday";
            case 2: return "Tuesday";
            case 3: return "wednesday";
            case 4: return "thursday";
            case 5: return "friday";
            case 6: return "saturday";
            case 7: return "sunday";
            default:
                System.out.println("invalid day- "+day);
                return null;
        }
    }
    public static String getdayNameV2 (int day){
        String dayName;
        switch(day){
            case 1: dayName= "Monday"; break;
            case 2:
                dayName= "Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName= "Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName= "Saturday";
                break;
            case 7:
                dayName= "Sunday";
                break;
            default:
                System.out.println("invalid day- "+day);
                dayName=null;

        }
        return dayName;
    }




}
