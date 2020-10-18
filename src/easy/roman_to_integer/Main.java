package easy.roman_to_integer;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int number = 0;
        int lasIndex = mapRomanToInt(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            int mappedNumber = mapRomanToInt(s.charAt(i));

            if(mappedNumber <= lasIndex){
                number += mappedNumber;
            }else {
                number = number - lasIndex + (mappedNumber-lasIndex);
            }
            lasIndex = mappedNumber;
        }
        return number;
    }

    private static int mapRomanToInt(char s){

        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}


