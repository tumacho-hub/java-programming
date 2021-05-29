package OfficesHoursMainFolder.Practice_05_17_2021.Prcatice_05_18_2021;

public class Earth {
    public static void main(String[] args) {
        AnimalsSpecies dogs = new AnimalsSpecies();
        dogs.setInfo("dogs",50,10 );
        System.out.println(dogs.getName());
        System.out.println(dogs);

        AnimalsSpecies cats = new AnimalsSpecies();
        cats.setInfo("cats", 100,15);
        System.out.println(cats);

        AnimalsSpecies birds =  cats;
        cats.setInfo("birds", 200, 20);
        System.out.println(birds);
    }
}
