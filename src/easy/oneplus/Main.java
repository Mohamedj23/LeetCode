package easy.oneplus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,9};
        int[] incrementedDigits = plusOne(nums);

        for (int i = 0; i< incrementedDigits.length; i++) {
            System.out.println(incrementedDigits[i]);

        }
    }

    public static int[] plusOne(int[] digits) {
        // ITERATE IT BACKWARDS

        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }

            digits[i] =0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
