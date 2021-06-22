package easy.movezeros;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        optimizedMoveZeroes(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1)
            return;

        int[] movedArray = new int[nums.length];

        for (int i = 0,j=0; i < nums.length; i++) {
            if(nums[i] != 0){
                movedArray[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = movedArray[i];
        }
    }

    public static void optimizedMoveZeroes(int[] nums){
        int availableIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[availableIndex++] = nums[i];
            }
        }

        for (int i = availableIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
