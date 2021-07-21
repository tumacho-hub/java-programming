package personal_Training_Starts_7_20_2021;

public class Switch {
    /*
    [House Occupants]
    Given a house type (String) print out the number of max occupants (int)
    Tree house: 1
    Mobile home: 2
    Apartment: 4
    Town house: 6
    Villa: 8
    Mansion: 10
    -> Try to use variables instead of printing multiple times
     */
    public static void main(String[] args) {

        String houseType = "Mobile home";
        int maxOccupants = 0;

        switch (houseType){
            case "Tree House":
                maxOccupants = 1;
                break;
            case "Mobile home":
                maxOccupants = 2;
                break;
            case "Apartment":
                maxOccupants = 4;
                break;
            case "Town house":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
        }
        System.out.println("Max occupants for a " + houseType + " is " + maxOccupants + " occupants");
    }
}
