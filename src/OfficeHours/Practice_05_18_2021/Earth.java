package OfficeHours.Practice_05_18_2021;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies bird= new AnimalSpecies();
        bird.setInfo("planet", 1000, 5);
        System.out.println(bird.getName());
        System.out.println(bird);

        //2nd object:
        AnimalSpecies cats= new AnimalSpecies();
        cats. setInfo("blue",40,2);
        System.out.println(cats);

        //3rd object:
        AnimalSpecies dogs= cats;
        cats.setInfo("green", 67,9);
        System.out.println(dogs);
        System.out.println(cats);

    }
}
