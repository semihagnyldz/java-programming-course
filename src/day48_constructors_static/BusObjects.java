package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        //we have 3 custom classes, bus, drievr, engine
        //bus has object of driver
        //bus has a object of engine
        Bus bus = new Bus();
        //bus has no driver and engine yet
        bus.driver= new Driver ("Semiha");
        bus.engine= new Engine(10);
        System.out.println(bus.toString());

        Bus metroBus= new Bus();
        metroBus.driver= new Driver("hasan");
        //metroBus.engine= new Driver();

    }

}
