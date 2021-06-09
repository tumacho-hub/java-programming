package day_51_Inheritance_Continue.super_keyword;

public class Lux extends Lyft{
    @Override
    public double CalculateRate(double miles){
       // return will be calculateRate of lyft + plus 20 percent
        return super.CalculateRate(miles)*1.2;

    }
}
