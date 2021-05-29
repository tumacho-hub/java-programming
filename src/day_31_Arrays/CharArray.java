package day_31_Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char each : letters) {
            System.out.println(each + " ");
            // below is a combination of how can you convert charAt to String
            //   String sentence = new String(letters);
            // System.out.println( "\n sentence = " + sentence);

        }
        // below is a combination of how can you convert charAt to String
        //  String sentence = new String(letters);
        //  System.out.println( "\n sentence = " + sentence);
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        ///                  0          1         2        3      4          5
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";

        for (String frutlist : fruits) {
            System.out.print(frutlist + " ");
            // we storing the value of the variable to the new variable
            fruitStr += frutlist;
        }
        System.out.println("\nfruitStr = " + " "+ fruitStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby","javascript"};
        System.out.println(String.join(" | ", languages));
        System.out.println(String.join("## ",languages));
        System.out.println(String.join("<>", languages));
    }
}
