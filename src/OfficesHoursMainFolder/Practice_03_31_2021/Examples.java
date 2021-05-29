package OfficesHoursMainFolder.Practice_03_31_2021;

public class Examples {
    public static void main(String[] args) {
      // In this example we want to count how many E are in jorge word


        String  word = "jorgevergas";
        char letter = 'e';
        int count = 0;  // this variable is going to store the out letters 'e'


        for (int i = 0; i < word.length(); i++){
// in this case we are using CHARAT because our purpose is to read each character of the word
            if (word.charAt(i) == letter){
                count++;
            }

        }
        System.out.println(letter +" was found " + count + " times in " + word);
    }
}
