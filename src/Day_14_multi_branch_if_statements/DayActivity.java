package Day_14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "rainy";
        if (weather.equals("Sunny")) {
            System.out.println(weather + " go to park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + "stay home, drink tea and code java ");

        }else if (weather.equals("snowy")) {
            System.out.println(weather + " clean the car, drink hot chocolate and code java :)");

        } else if (weather.equals("windy")) {
            System.out.println(weather + " get ready for power off, fly a kite, and code java");
        }else {
            System.out.println("just keep coding java");
        }
    }
}
