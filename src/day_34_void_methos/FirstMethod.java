package day_34_void_methos;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage(); // 1st call the method
        displayMessage(); // 2nd call to method

        for (int i = 1; i<=100; i++) {
            System.out.print(i + "-");
            displayMessage();
        }
        }
        //  first custom reusable method
        public static void displayMessage() {
            System.out.println("Hello B22 friends");
    }
}
