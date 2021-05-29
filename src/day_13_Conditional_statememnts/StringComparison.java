package day_13_Conditional_statememnts;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles"; // case sentive make sure it equals the same
        if (city.equals("Los Angeles")) {
            System.out.println("it is LA");
        } else {
            System.out.println("It is Not LA");
        }
        String weather = "sunny";
        if (weather != "sunny") { // <-- it will work but avoid not correct!!
            System.out.println("lets go back and code java");

        } else {
            System.out.println("lets stay home and chill");
        }
    }
}
