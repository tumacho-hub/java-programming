package day_18_conditions_practice_Strings;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 55;
        if (score >= 1 && score <= 40 ) {
            System.out.println("Grade D ");
        }else if (score >= 41 && score <= 60) {
            System.out.println("Grade C");
        }else if (score >= 61 && score <= 70) {
            System.out.println("Grade B");
        }else if (score >= 71 && score <= 100){
            System.out.println("You get an A");
        }
    }

}


