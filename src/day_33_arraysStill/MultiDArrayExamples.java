package day_33_arraysStill;
import java.util.*;
public class MultiDArrayExamples {
    public static void main(String[] args) {

        String [][] users = new String[3][2];
        //                0        1
        users[0][0] = "teodora tsvetanov";
        users[0][1] = "teodorapassword12";
        users[1][0] = "leonel punal";
        users[1][1] = "leonelpasword20";
        users[2][0] = "george lopez";
        users[2][1] = "georgePassword21";
        String [][] userdata = {{"teodora tsvetanov","teodorapassword12"},
                               {"leonel punal","leonelpasword20"},
                                 {"george lopez","georgePassword21"} };

        System.out.println(userdata[0][0].split(" ")[0]);
        System.out.println(userdata[1][0]);
        System.out.println(userdata[2][0]);

        System.out.println(userdata[0][1]);
        System.out.println(userdata[1][1]);
        System.out.println(userdata[2][1]);

        System.out.println(Arrays.deepToString(userdata));

        int[][] nums2d ={
                {12,55,4,7},
                {123,555,9},
                {56,87,455,34},
                {234,12,54,23,23}};
        System.out.println("nums2d[2][2] = " + nums2d [2][2] );

        for (int i = 0; i < nums2d.length; i++) {
            for (int j =0; j<nums2d[i].length; j++) {
                System.out.print( " " + nums2d[i][j]);
            }
        }



    }
}
