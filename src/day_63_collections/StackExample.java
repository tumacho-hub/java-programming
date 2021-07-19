package day_63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");

        bookStack.add("Leaders eat last");

        bookStack.add("Java Intro");
        bookStack.push("Cucumber");
        System.out.println(bookStack);
        System.out.println(bookStack.remove(0));
       // bookStack.pop(); // removes and returns the top of the stack item
//        System.out.println(bookStack.pop());
//        System.out.println(bookStack);
         System.out.println("This is at the top of the stock " + bookStack.peek());



    }

}
