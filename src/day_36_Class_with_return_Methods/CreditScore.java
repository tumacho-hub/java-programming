package day_36_Class_with_return_Methods;

public class CreditScore {
    public static void main(String[] args) {
checkEligible(720);
checkEligible(760);
checkEligible(400);
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore() );

        int score = getCreditScore();
        System.out.println("Score = "+ score);
    }
    public static void checkEligible(int creditScore){

       if( creditScore >= 700 ){
           System.out.println("you are eligible to lease this car");

       }else{
           System.out.println("sorry you are not eligible for leasing this car");
       }
    }
    public static int getCreditScore(){
        return 800;
    }
}
