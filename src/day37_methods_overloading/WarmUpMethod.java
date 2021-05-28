package day37_methods_overloading;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class WarmUpMethod { //BUNA BIDAHA BAK!
    public static void main(String[] args) {
        loginVoid("cybertekStudent","abc123");// positive test
        loginVoid("cybettek", "4657fh");
        System.out.println(login("semiha","123"));
        boolean isLoginSuccess= login("hafsa","yes");
        System.out.println(isLoginSuccess);
        if(login("cybertekstudent","abc123")){
            System.out.println("login successful");
        }else{
            System.out.println("sth wrong");
        }
    }
    public static void loginVoid (String userName,String password){
        String secretUsername= "cybertekStudent";
        String secretPassword = "abc123";
        if(secretUsername.equalsIgnoreCase("cybertekStudent")&&secretPassword.equals("abc123")){
            System.out.println("Login Succesful, welcome cybertekStudent");
        }else{
            System.out.println("Incorrect username or password");
        }

    }
    public static boolean login(String userName, String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        return userName.equals(secretUsername)&&password.equals(secretPassword);

       /* if(userName.equalsIgnoreCase(secretUsername) && password.equalsIgnoreCase(secretPassword)){
            return true;// return true and at the same time exit the method here. return false will not run so no need to have else statement
        }else{
            return false;
        }

        */
    }
}
