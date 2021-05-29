package day_20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
// if company contains space, print "company name with multiple words"
        //otherwise "single word company name
        // String word = "company";
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("j"));
        System.out.println(company.contains("one"));
        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }
            String etsyTitle = "wooden spoon | Etsy";
            if (etsyTitle.contains(" | ")) {
                System.out.println("pass - title check passed");
            } else {
                System.out.println("fail - title check failed");
            }
            String firstName = "ahmed";
            if (firstName.contains("a")  && firstName.contains("e")) {
                System.out.println("both a && e are present");
            }else{
                System.out.println("a || e not present");
            }
            firstName = "Nadir";
            if (firstName.contains("a") || firstName.contains("i")) {
                System.out.println("a or i is present");
            }else{
                System.out.println("nor a or i is present");
            }

            String email = "murodil@cybertekschool.com";
            if (email.contains("@") && email.endsWith(".com")) {
                System.out.println("valid email");
            }else{
                System.out.println("invalid email");
            }

            }

        }


