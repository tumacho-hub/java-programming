package day_35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(8);
        count(20);
        int num2 = 999;
        count(num2);
        String word = "wooden spoon";
        count(word.length());
        getAge(1986);
        getAge(1987);
        Etsy(word);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }

public static void Etsy(String str){
    System.out.println("Wooden Spoon");

}

    public static void getAge(int year) {
        int age = 2021 - year;
        System.out.println("Birthday: " + year + " age: " + age);
    }
}
