package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN=1234;
        int pinCode=3421;
        int expLast4SSN=1234;
        int expPinCode=4321;
        if(last4SSN==expLast4SSN && pinCode==expPinCode){
            System.out.println("Authentication successful");
        }else if(last4SSN!= expLast4SSN && pinCode!=expPinCode){
        System.out.println("Authentication unsuccessful");
            if(last4SSN!=expLast4SSN){
                System.out.println("last 2 SSN is wrong");
            }else if(pinCode!=expPinCode){
                System.out.println("pincode is wrong");
            }
        }
    }
}
