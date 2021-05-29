package day_25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars < 16; stars++) {
            System.out.print(stars+"*");
        }
        System.out.println();
        String myStars = "";
        // fill 5 stars to myStars variable.
        //        i           i           i
        for (int Stars = 1; Stars <= 5; Stars++) {
          //  myStars = myStars +"* ";
            myStars += " * "; // this is the line we need to keep repeating this is why we add this variable thou!!

        }
        System.out.println("my start = " + myStars);
    }
}
