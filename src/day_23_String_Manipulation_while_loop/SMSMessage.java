package day_23_String_Manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
         String message = "Sender: [Morodil] From Number<(202)375-1774>Message:{Hello, lets code some java}";

         int start = message.indexOf("["); // we are declaring the index beginning

         int end = message.indexOf("]");   // we declaring the end of it.. we also have to break at part step by step

        System.out.println(message.substring(start, end));

        System.out.println(message.substring(start+1, end));

        String sender =  message.substring(start+1, end);

        System.out.println("sender = " + sender);

        // example how to put it together next line
        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));

        System.out.println("mobile = " + mobile);
        
        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));

        System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());

        sender = sender.trim();

        if (sender.equals("saim")) {
            System.out.println("message from Saim about homework");
        }else {
            System.out.println("some one else message");
        }
    }




}

