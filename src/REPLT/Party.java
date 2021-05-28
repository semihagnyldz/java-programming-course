package REPLT;

import java.util.Scanner;
public class Party {
    public static void main(String[] args) {
        String guestname, answer;
        String guestList="";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name");
        guestname=input.next();
        guestList+=guestname+", ";
        do{
            System.out.println("Do you want to add next guest?");
            answer=input.next();
            //guestList+=guestname;

            if(answer.equals("yes")){
                System.out.println("Please enter guest name");
                guestname=input.next();
                guestList+=guestname+", ";
            }else{
                guestList=guestList.substring(0,guestList.lastIndexOf(","));
                System.out.println("Guest's list: "+guestList);
            }



        } while (answer.equals("yes"));


        }
    }

