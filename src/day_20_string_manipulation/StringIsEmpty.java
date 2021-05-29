package day_20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {


         String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("job title looks good ");
        }
        if (jobTitle.length() == 0) {
            System.out.println("job title is empty");
            /// another way to do it..is
            System.out.println(jobTitle.equals(""));
        } else {
            System.out.println("job tittle is not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());


            String veggie = "hh";
        System.out.println(veggie.isEmpty());
        if (veggie.equals("hh") ) {
            System.out.println("We have carrots");
        }else{
            System.out.println("we need carrots!");

        }


            }

        }


