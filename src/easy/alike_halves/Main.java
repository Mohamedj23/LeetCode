package easy.alike_halves;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSimilar("AbCdEfGh"));
    }

    private static boolean isSimilar(String s){
        int midLength  = s.length()/2;
        s = s.toLowerCase();
        String firstHalf = s.substring(0,midLength);
        String secondHalf = s.substring(midLength);

        int firstHalfVowelsCount = countVowels(firstHalf);
        int secondHalfVowelsCount = countVowels(secondHalf);
        return firstHalfVowelsCount == secondHalfVowelsCount;
    }

    private static int countVowels(String firstHalf) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('u');
        vowels.add('o');

        int counter = 0;
        for (int i = 0; i < firstHalf.length(); i++) {
            if(vowels.contains(firstHalf.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}
