package easy.singlenumber;

public class Main {

    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {
        int a = 0;

        for (int num: nums){
            a ^= num;
        }
        return a;
    }
}
