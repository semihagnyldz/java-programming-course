package day53_inheritance_tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;

    protected void drive(int miles){
        if(range==0 || range- miles<0 ){
            System.out.println("ERROR: cannot drive thta far");
        }else{
            range-= miles;
            System.out.println("Driving "+miles+ " miles");
        }

    }
    public static int getCount(){
        return count;
    }

    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make);//same as below methods. also can write this way
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public String getMake() {
        return make;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setMake(String make) {
        if (!make.isEmpty()) {

            this.make = make;
        }else{
            System.out.println("error");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
