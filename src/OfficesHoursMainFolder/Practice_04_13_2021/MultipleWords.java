package OfficesHoursMainFolder.Practice_04_13_2021;

public class MultipleWords {
    /*+
    Multiple Words
    Given a string of words that are separate by commas. Find and print any words that have more than one word.
    Example

    input: "knife,wooden spoons,plates,cups, forks, pan, pot, trash can, fridge, dish washer"
    output: wooden spoons
*/
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] arrWords = words.split(", ");

        for (String eachWord : arrWords){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }


    }



}
