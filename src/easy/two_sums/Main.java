package easy.two_sums;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int nums[] = twoSum(new int[]{3,2,4},6);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(target- numbers.get(i))){
                if(i != numbers.indexOf(target -numbers.get(i))){
                    return new int[]{i, numbers.indexOf(target - numbers.get(i))};
                }
            }
        }
        return null;
    }

    //One-pass Hash Table Approach
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int[] onePassHashTable_twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
