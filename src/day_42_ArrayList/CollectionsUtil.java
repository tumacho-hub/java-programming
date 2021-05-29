package day_42_ArrayList;
import java.util.*;
import java.util.concurrent.Callable;

public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        Collections.frequency(letters, 'a');

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));

        System.out.println("Min char = " + Collections.min(letters));

       Collections.reverse(letters);

        Collections.replaceAll(letters, 'a', 'u');
      Collections.replaceAll(letters, 'i','j');

        System.out.println("After replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23,1,20,45,12,3,5,4,32,8,86,55,4,4,4);

        System.out.println(nums);
       Collections.reverse(nums);
        System.out.println("Nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOfFour = Collections.frequency(nums, 4);
        System.out.println("countOfFour = " + countOfFour);

        int countOf1s = Collections.frequency(nums,5);
        System.out.println("countOf1s = " + countOf1s);

        Collections.replaceAll(nums, 4, 3);
        System.out.println("After replace all = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);


Collections.shuffle(nums);
        System.out.println("after shuffle = " + nums);





            }
        }











