package day52_inheritance.mobileParctice;

public class Discord extends MobileApp {
    public void chat (String someone){
        System.out.println("chatting with "+someone+ " on Discord");
    }
    @Override
    public void useTheApp (int minutes){
        super.useTheApp(minutes);
        chat("semiha");
    }

    @Override
    protected boolean download(){
        System.out.println("downloaded discord "+getVersion());
        return true;
    }
}
