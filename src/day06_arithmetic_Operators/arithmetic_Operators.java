package day06_arithmetic_Operators;

public class arithmetic_Operators {
    public static void main(String[] args) {
        String brand = "Ford 2005";
        String driveName = "Jorge Flores";
        String licenNum = "F5857-2564";
        Short speed = 55;
        char licenseClass = 'B';
        boolean isAutomatic = true;
        System.out.println("Car Model is: " + brand);
        System.out.println("Driver's Name " + driveName);
        System.out.println("License Number # " + licenNum);
        System.out.println("Speed Limit: " + speed);
        System.out.println("License Class: " + licenseClass);
        System.out.println("Is Automatic? " + isAutomatic);
        //jorge flores is driving a ford
        System.out.println(driveName + " is driving a " + brand);
        System.out.println("Current Speed is: " + speed + "mhp");
        System.out.println("Is This CarAutomatic: " + isAutomatic);

    }
}