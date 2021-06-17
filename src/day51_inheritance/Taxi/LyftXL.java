package day51_inheritance.Taxi;

import day51_inheritance.Taxi.Lyft;

public class LyftXL extends Lyft {


    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles)*1.1;
    }
}
