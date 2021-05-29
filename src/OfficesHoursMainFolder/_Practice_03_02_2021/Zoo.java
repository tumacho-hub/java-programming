package OfficesHoursMainFolder._Practice_03_02_2021;

public class Zoo {

        /*
        Make a class Zoo
make a main method

Create variables and give some values

    - For this one, pick which datatype you think is best for each variable

    - name, founded date, starting time, closing time, open on holidays, has aquarium section, number of big cats, number of hoofed animals, number of reptiles, number of birds,
    number of primates, number of employees, ticket cost for adults, ticket cost for under 13, park rules,

    - Make a brochure of the zoo's information.
         */
        public static void main(String[] args) {
            String zoo = "Lincoln Park Zoo";
            int foundedDate = 1868;
            int StartingTime = 10;
            int closingtime = 5;
            boolean openInHolyDays = false;
            boolean hasAquarium = false;
            int bigCats = 5;
            int hoofedAnimals = 30;
            int numberOfReptiles = 10;
            int numberOfBirds = 25;
            int numberOfPrimates = 10;
            int numberOfEmployees = 30;
            double ticketsCOstForAdults = 14.99;
            double ticketCostForUnderage = 7.99;
            String parkRules = "Do not fed the Animals they will get wild";

            System.out.println("Welcome to: " + zoo +"\n" + "Founded Date: " + foundedDate + "\n" + "Business hours " + StartingTime + "AM  to " + closingtime +""
            +"PM " +  "\n" + "Is zoo open in HolyDays?" +openInHolyDays + "\n" + "Does zoo has an aquarium? " + hasAquarium + "\n" +
                    "How many Lions does it has? " + bigCats + "\n" + "Number of Hoofed aAnimals? "+ hoofedAnimals + "\n" + "Number of Reptiles? " + numberOfReptiles +
                    "\n" + "number of Primates? " + numberOfPrimates + "\n" + "How many spices of birds: " + numberOfBirds + "\n" + "Staff members: " + numberOfEmployees +
                    "\n" + "Adult admission $ " + ticketsCOstForAdults + "\n" + "Kids half off $ " + ticketCostForUnderage + "\n" + "Zoo rules: " + parkRules);
        }
}
