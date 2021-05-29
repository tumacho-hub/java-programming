package day_48_constructors;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class CustomerObjects {
    public static void main(String[] args) {
     Customer cst1 = new Customer();
        System.out.println(cst1.toString());// prints default!!

        cst1.setId(1);
        cst1.setName("bob");
        System.out.println(cst1);


Customer cst2 = new Customer("Mike",2);// creates object and assign values in the same statements

        Customer cs3 = new Customer("john ward III", 4873);
        System.out.println(cst2);
        System.out.println(cs3);


        //array of customers


        Customer[] todaysCustomer = {cst1, cst2, cs3, new Customer("Bashir",449)};

        //array list of customer list

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cst1);
        customerList.add(cst2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("Suleyman",9763));
      //  print infomation of first customer object in array and arraylist


        System.out.println(todaysCustomer[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));



        }

        System.out.println("--------- for each loop");
        for (Customer each : customerList){
            System.out.println(each);
        }
        //print only the names of customers in the list with lambda
        System.out.println("_-------Names of customers");

        customerList.forEach(each -> System.out.println(each.getName()));

        for (Customer each : customerList){
            System.out.println(each.getName());
        }




    }
}
