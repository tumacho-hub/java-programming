package day_16_Switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {

        int floorNum = 29;
        if (floorNum==1) {
        } else if (floorNum==2) {
            System.out.println();
        }else if (floorNum==3) {
            System.out.println("Floor 2 selected. Company: Lyft, Bofa, Starbucks");
        }else {
            System.out.println("Invalid floor -" + floorNum);
        }
        System.out.println("==========SWITCH STATEMENT Version");

        floorNum = 4;
        switch(floorNum) {
            case 1:  // same as
                if (floorNum==1)
                    System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intesel");
                break;
            case 2:// Exit switch
                System.out.println("floor 2 seleected. Companies: Lyft, chase");
                break; // EXIT the SWITCH statement
            case 3:
                System.out.println("floor 3 selected. companies : chipotle, donkey donuts");
                break;
            default:
                System.out.println("Invalid floor Dum Dum is only three floors - " + floorNum);
                break;

        }
    }
}
