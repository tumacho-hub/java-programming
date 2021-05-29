package day_25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        /*warm up:
    add new package day25_loops
    add new class WhileHungry

    boolean isHungry = true;
    int bananas = 0;
    int countToFull = 3;
    it takes 3 bananas reaches countToFull
    set hungry to false
    increase banana by one */

        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        // while (ishungry && bananas  != counttofull) another example on how to do it!!
        while (isHungry) {
            bananas++;
            System.out.println("Eating a babana: " + bananas);
            //we can use ternary = ishungry == bananas ==counttofull? false : true;
            if (bananas == countToFull) {
                isHungry = false;
            }
            System.out.println("had enough bananas, let's go back to study");
        }


    }
}
