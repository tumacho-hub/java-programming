package test1;

import java.util.*;

public  class comedy {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,1,4,7,2,3,4,5,1));
        Set<Integer>set = new LinkedHashSet<>();
        for (Integer num : list ){
            set.add(num);
            set.add(null);
        }
        System.out.println(set);
            }

        }


