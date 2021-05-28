package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand= "Apple"; // string icin number ve letter works, any value in "" is string.
        // char includes single character. mesela iPhone yazamazsin, ama i yazabilirsin char ile.
        String model= "iphone 11";
        String color= "green";
        double price= 699.0;
        int storage= 256; // short storage both work
        boolean hasCamera= true;
        System.out.println(brand);
        System.out.println(model);
        System.out.println("Brand is "+ brand);
        System.out.println("Color is "+ color);
        System.out.println("Has camera: "+hasCamera);
        System.out.println("Storage is "+ storage + " GB");


    }
}
