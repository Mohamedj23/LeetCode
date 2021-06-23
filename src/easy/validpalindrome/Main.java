package easy.validpalindrome;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("101"));
    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 1)
            return true;

        List<Character> characters = s.chars().
                mapToObj(c-> (char)c)
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .collect(Collectors.toList());


        for (int i = 0, j=characters.size()-1; i < characters.size()/2; i++,j--) {
            if(characters.get(i) != characters.get(j))
                return false;
        }
        return true;
    }
}
