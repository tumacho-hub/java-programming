package Day_14_multi_branch_if_statements;

import java.sql.SQLOutput;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("are you sure you want to deteled this file?");
        char YesOrNot = 'F';
        boolean answer;
        if (YesOrNot=='Y') {
            System.out.println("your file will be deteled!");
            answer = true;
        } else {
            System.out.println("files delition will be cancelled");
            answer = false;
        }
        System.out.println("this file get deleted ?" + answer);
    }

}
