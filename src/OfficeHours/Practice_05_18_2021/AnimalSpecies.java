package OfficeHours.Practice_05_18_2021;

public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    public void setInfo (String name1, int population1, int growthRate1 ){
        name=name1;
        population=population1;
        growthRate=growthRate1;
    }
    public String getName (){
        return name;
    }
    public int getPopulation(){
        return population;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }

    public int getGrowthRate(){

        return growthRate;
    }
}
