package day_12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
      /* ABCDEFG..
          A > B -> A IS CONSIDERED SMALLER THAN B. THE EARLIER IT APPEARS IN ALPHABET
          IT WILL BE SMALLER THAN LATTERS THAT APPEAR LATER IN ALPHABET.
              ALL PROGRAMMING RUN/USE COMPARISON INCREASING ALL THE TIME

         exap: letter1, letter2, assign char values.
         print and check if they are equal

       */

        char letter1 = 'A';
        char letter2 = 'J';

        System.out.println(letter1 == letter2);// make sure to use double==
        System.out.println(letter1 > letter2);
        System.out.println(letter2 > letter1);

        char grade = 'E';
       //? pass ?
        boolean pass = grade <= 'D';// *boolean* cuz we are compering no matter what we compered
        System.out.println("Did you pass the exam? - " +  pass);

        /* for java if we used IF WE NEED PARENTHESIS

        CONDITIONAL STATEMENTS IN JAVA:
        We use conditional statement in our daily lives. if it raining, get umbrella.
        if car gas is showing low, go to gas station.
        if john is hungry, he eats.
        if cellphone battery is low, charge it, otherwise keep using it, etc etc

        we IF STATEMENT in java for conditions.
        It works with BOOLEAN conditionals.
        if(10 > 5){
        System.out.println("Condition is True -> 10 is greater than 5");
        }else{
        System.out.println("condition is False')

         */


















    }
}
