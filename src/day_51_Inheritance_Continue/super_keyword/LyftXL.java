package day_51_Inheritance_Continue.super_keyword;

public class LyftXL extends Lyft {

    @Override
    public double CalculateRate(double miles){
        return super.CalculateRate(miles)*1.1;
        }
    }


