package day17_ternary_nested_conditions;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 75;
        String result1;
        if (score1 > 60) {
            result1 = "Pass";
        } else {
            result1 = "Fail";
        }
        System.out.println("result1 = " + result1);


        //with ternary:
        int score = 88;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);
        //or sole de yapabilirdik: boolean result= (score>60) ama string le yukardaki gibi yapioruz

        String quality= "dhf";
        int rating= quality.equals("good") ? 100 : 0;
        System.out.println(rating);
        System.out.println(quality.equals("good") ? 100 : 0);

        int score3= 100;
        char grade;
        /*if (score>90){
            grade='A';

        }else {
            grade= 'B';
        }

         */
        //tek line olmasi icin ternary yapcaz:
        grade= (score3>90) ? 'A':'B';
        System.out.println(grade);

        int num1= 10;
        int num2= 30;
        int max= num1>num2 ? num1 : num2;


    }
}
