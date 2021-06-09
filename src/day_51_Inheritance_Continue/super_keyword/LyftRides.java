package day_51_Inheritance_Continue.super_keyword;

public class LyftRides {
    public static void main(String[] args) {

        Lux lux = new Lux();
        Lyft lyft = new Lyft();
        LyftXL lyftXL = new LyftXL();


        System.out.println("lyft.CalculateRate(2) = " + lyft.CalculateRate(3));
        System.out.println("lyftXL.CalculateRate(3) = " + lyftXL.CalculateRate(4));
        System.out.println("lux.CalculateRate(5) = " + lux.CalculateRate(5));
    }
}
