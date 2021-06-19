package OfficeHours.Practice_06_15_2021;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EmailObject {
    public static void main(String[] args) {

        Email email= new Email ("Anton@cybertekchool.com", 43);
        //email.ADDRESS= "EMAIL"; CANT DO BC IT IS FINAL, CANT CHANGE THE VALUE
        System.out.println(email);

        System.out.println(Email.domain);
        System.out.println();

        Gmail gmail= new Gmail("semihagn@gmail.com", 12);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain); //bc domain is static we can call it using the class name
    }
}
