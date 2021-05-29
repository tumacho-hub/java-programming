package OfficesHoursMainFolder.Practice_04_12_2021;

public class MinAndMaxFromArray {
    /*
    Max and Min number from Array•
    Write.a program that can find the maximum number from any given int array•
    Write a program that can find the minimum number from any given int array
     */
    public static void main(String[] args) {
        int[] numbers = {3, 1, 5, -3, -110, 4, 3};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}








