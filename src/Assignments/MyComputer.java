package Assignments;

public class MyComputer {
    public static void main(String[] args) {
        String brand= "HP";
        String processor= "2.2 GHZ Quard-Core";
        String ramMemory= "16 GB 1600 MHz ddr3";
        String storage= "251 GB";
        String color= "Silver Grey";
        double price= 500.0;
        boolean hasMonitor= true;
        boolean hasWifiCard= true;
        boolean hasUSB3= true;
        byte numberOfMonitors= 2;
        short numberOfUSBSlots= 2;
        String description= "I bought this from my husband work place, very good pc";
        System.out.println("Brand is: " +brand);
        System.out.println("Processor is: "+processor);
        System.out.println("Ram memory is: "+ramMemory);
        System.out.println("PC's storage is: "+ storage);
        System.out.println("PC's color is: "+color);
        System.out.println("PC's' price is: " +price);
        System.out.println("Has monitor: "+hasMonitor);
        System.out.println("Has WiFi: "+hasWifiCard);
        System.out.println("It has "+numberOfMonitors+ " number of monitor");
        System.out.println("It has "+numberOfUSBSlots+" number of USB Slots");
    }
}
