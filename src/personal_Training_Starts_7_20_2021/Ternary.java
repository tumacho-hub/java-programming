package personal_Training_Starts_7_20_2021;

public class Ternary {
    /*    [Morning or Night]
        Given some time value (int) in 24 hours format. Print if its the morning or night,
        0 -11 : Morning
        12-24 : Night->
        You can assume the value given is always valid (in the 24 hours range),
        but if you want a challenge use an if to control invalid values

     */
    public static void main(String[] args) {
        int time = 8;
        String morningOrNight = time > 0 && time < 12 ? "morning" : "night";
        System.out.println(morningOrNight);
    }
}
