package easy.containduplicates;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(containsDuplicate(nums));;
    }

    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).
                distinct().
                toArray().
                length != nums.length;
    }
}
