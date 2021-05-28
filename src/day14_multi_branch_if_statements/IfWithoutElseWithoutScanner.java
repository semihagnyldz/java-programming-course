package day14_multi_branch_if_statements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IfWithoutElseWithoutScanner {
    public static void main(String[] args) {
        int year= 2020;
        if(year==2020){
            System.out.println("wear mask");
        }
        String country= "USA";
        if(country.equals("Turkey")){
            System.out.println("Washington DC is the Capitol");
        }
        System.out.println("Welcome to "+country);
    }
}
