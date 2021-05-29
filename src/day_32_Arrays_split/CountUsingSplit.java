package day_32_Arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here no more cat cat";
      /*  int count = 0;
        for (int i = 0; i < cats.length() - 2; i++) {
            if (cats.substring(i, i + 3).equalsIgnoreCase("cat")) ;
            System.out.println(i);

       */


            String[] catsArrays = cats.split("cat");
            System.out.println("number of cats = " + (catsArrays.length - 1));
            for (String each : catsArrays){
              System.out.println(each);
          }
        }

    }


