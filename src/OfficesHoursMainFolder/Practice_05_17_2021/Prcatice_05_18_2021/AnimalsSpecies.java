package OfficesHoursMainFolder.Practice_05_17_2021.Prcatice_05_18_2021;

public class AnimalsSpecies {

    String name;
    int population;
    int growthPopulation;

    public void setInfo(String setName, int setPopulation, int setGrowthRate) {

        name = setName;
        population = setPopulation;
        growthPopulation = setGrowthRate;


    }

    public String getName() {
        if (name == null) {
            return "No name definied";

        }
        return name;
    }
    public int getPopulation(){
        return population;
    }

    public int getGrowthPopulation() {
        return growthPopulation;

    }
    @Override
    public String toString() {
        return "AnimalsSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthPopulation=" + growthPopulation +
                '}';
    }



        }





