package easy.palindrome_number;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(212));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        StringBuilder reversedNumber = new StringBuilder(Integer.toString(x));

        if (Integer.toString(x).contentEquals(reversedNumber.reverse()))
            return true;

        return false;
    }

    public static boolean isPalindromeUsingString(int x) {
        if (x < 0)
            return false;

        String number = Integer.toString(x);

        for (int i = 0, j = number.length() - 1; i < number.length(); i++, j--) {
            if (number.charAt(i) != number.charAt(j))
                return false;
        }
        return true;
    }

    /*
    * This answer is recommended by leetCode as using string would require extra non-constant space
    * for creating the string which is not allowed by the problem description.
    * Time complexity : O(log10(n)). We divided the input by 10 for every iteration, so the time complexity is O(log10(n))
    * Space complexity : O(1).
    */
    public boolean isPalindromeUsingMod(int num){
        if(num < 0) return  false;
        int reversed = 0, remainder, original = num;
        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }

}
