package Day_14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        double year = 2020;
        if (year==2020) {

            System.out.println("covid19 pandemic year");
            System.out.println("wear mask, and keep 6 feet distance");
        }
        System.out.println("keep coding java");

        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital ");
            System.out.println("White house is on Pennsylvania ave");

            if (10>5){
                System.out.println("10 is greater than 5 dug!");
            }
        }
        System.out.println( "Welcome to " + country);
    }


}
