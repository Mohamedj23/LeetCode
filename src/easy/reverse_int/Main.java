package easy.reverse_int;

public class Main {

    public static void main(String[] args) {

        System.out.println(improvedReverse(120));
    }

    public static int reverse(int x) {
        boolean isNegative = false;
        if(x < 0){
            x = x * -1;
            isNegative = true;
        }

        String number = Integer.toString(x);
        String reversedNumber = "";

        for (int i = number.length()-1; i >= 0 ; i--) {
            reversedNumber += number.charAt(i);
        }

        if(isNegative){

            return Integer.parseInt(reversedNumber) * -1;
        }
        return Integer.parseInt(reversedNumber);
    }

    public static int improvedReverse(int x){
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}
