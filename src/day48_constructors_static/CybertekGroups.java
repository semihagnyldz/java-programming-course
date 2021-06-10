package day48_constructors_static;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        //Group group1= new Group();---bole calismaz cunku biz group class da n0-arg constructor olusturmadik,
        // arg li constructor olusturduk, parantezin icni bos birakirsak error verir
        Group group1= new Group("Cyberbugs ");//dependency injection
        System.out.println(group1.getMembers().size()); //now it is 0
        //1st way: adding members to group
        group1.addMember("semiha");
        group1.addMember("meliha");
        group1.addMember("hafsa");
        group1.addMember("nagihan");
        group1.addMember("hasan");
        System.out.println(group1.getMembers().size());

        System.out.println(group1.toString());

        //2nd way: adding members to group
        Group group2= new Group("CyberCats");
        group2.setMembers(Arrays.asList("canan","semra","busra","omer","osman","zeynep"));
        //print all members. not toString
        System.out.println(group2.getMembers());
        //use if statement to check if semra is in the group2
        if(group2.getMembers().contains("semra")){
            System.out.println("semra is in the group2");
        }else{
            System.out.println("semra is not in the group2");
        }
        group1.removeMember("semiha");
        group1.getMembers().remove("meliha");
        System.out.println(group1.getMembers()); //output is: [hafsa, nagihan, hasan]--burda sadece namse print oluo.
        System.out.println(group1); //output is: Group{groupName='Cyberbugs ', members=[hafsa, nagihan, hasan]}

    }
}
