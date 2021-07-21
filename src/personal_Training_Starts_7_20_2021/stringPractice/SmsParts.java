package personal_Training_Starts_7_20_2021.stringPractice;
/*
[SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. +
Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
“Sender:  actualSender”
“Number: actualNumber”
“Message: actualMessage”
 */
public class SmsParts {
    public static void main(String[] args) {

        String actualMessage = "Sender: <James Bond>. From Number: [202-123-3456]. + Message:{I love programming and problem solving}";
        int senderOpen = actualMessage.indexOf("<");
        int senderClose = actualMessage.indexOf(">");
        String sender = actualMessage.substring(senderOpen+1,senderClose);

        System.out.println(sender);

        int number = actualMessage.indexOf("[");
        int numberClose = actualMessage.indexOf("]");
        String numberFrom = actualMessage.substring(number+1,numberClose);
        System.out.println(numberFrom);

        int messageStar = actualMessage.indexOf("{");
        int messageEnds = actualMessage.indexOf("}");
       String textMessage = actualMessage.substring(messageStar+1,messageEnds);
        System.out.println(textMessage);


    }
}
