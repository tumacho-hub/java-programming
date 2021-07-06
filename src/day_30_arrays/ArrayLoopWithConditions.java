package day_30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Armenia", "Philippines", "Colombia", "Honduras", "Indonesia",
                "China", "United States", "Russia"};


        System.out.println("------- prices more than 100 -------");
        for (double eachPrice : prices) {
            if (eachPrice > 100)
                System.out.print(eachPrice + ", ");
        }


        System.out.println("\n---- prices between 10 and 70 inclusive ----");
        for (double price : prices)


            if (price >= 10 && price <= 70) {
                System.out.print(price + " ");
            }

        System.out.println("\n------ count of the prices that are more than  50 ---------");
        int count = 0;
        for (double each : prices) {
            if (each > 50) {
                count++;
            }

        }
        System.out.print("count: " + count);
        System.out.println("\n----------countries with name length more than -- inclusive ");

        for (String country : countries){
            if (country.length() >= 7) {
                System.out.print(country + ", ");
                System.out.print(country.length() + " ");
            }
        }

    }
}









