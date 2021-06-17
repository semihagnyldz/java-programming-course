package day52_inheritance.mobileParctice;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp= new MobileApp();
        mobileApp.setName("facebook");//normall y we use a setter method.
        mobileApp.useTheApp(10);

        Instagram instagram= new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);

        Discord discord= new Discord();
        discord.setName("discord");
        discord.useTheApp(100);
    }
}
