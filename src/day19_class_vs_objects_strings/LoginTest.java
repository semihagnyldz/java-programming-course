package day19_class_vs_objects_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class LoginTest {
    public static void main(String[] args) {
        /*
        expUserName = "cybertek"
expPassword = "Abc123"

userName = "CYBERTEK"
password = "Abc123"

userName is not case sensitive
password is case sensitive

WHEN expUserName equals userName AND expPassword equals password
    -> "Pass - user successfully logged in"

OTHERWISE:
    WHEN expUserName NOT equals userName
        -> "Incorrect Username"
    OTHERWISE:
        -> "Incorrect password"
         */
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if (expUserName.equals(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user succesfully logged in");
        } else {
            if (!expPassword.equals(password)) {
                System.out.println("Incorrect password");
            } else if (!expUserName.equals(userName)) {
                System.out.println("Incorrect username");
            }
        }
    }
}

