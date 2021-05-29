package Day_14_multi_branch_if_statements;

public class MultiBranchesIfStatment {
    public static void main(String[] args) {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day == 3) {
            System.out.println("Wednesday");
        }
        System.out.println("============================================================ ");

        day = 20;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("java day");
            System.out.println("Everyday code java");

        }


    }
}