package day52_inheritance.mobileParctice;

public class Instagram extends MobileApp {
    public void postPhoto(){
        System.out.println("posting photos on instagram");
    }
    //write overriding method:
    //same signature needed:
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(10);
        System.out.println("using instagram app features");
        postPhoto();

    }
}
