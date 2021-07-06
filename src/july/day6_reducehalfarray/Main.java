package july.day6_reducehalfarray;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,2,2,2,7};
        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr) {
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> freq = map.values()
                .stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        int counter = 0;
        int totalElements = n;
        int i=0;

        while (totalElements > n/2){
            totalElements = totalElements - freq.get(i);
            i++;
            counter++;
        }
        return counter;
    }
}
