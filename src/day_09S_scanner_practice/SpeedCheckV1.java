package day_09S_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        // speed limit -> 55
        //currentSpeed-> 75  currentSpeed- SpeedLimit;
        int speedLimit = 55;
        int CurrentSpeed = 85;
        int overTheLimit = CurrentSpeed - speedLimit;
        System.out.println( "you are driving " + overTheLimit + "mph over the limit. Slow" +
                "down! ");




    }
}
