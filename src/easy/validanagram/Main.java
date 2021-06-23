package easy.validanagram;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));;
    }

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;

        List<Character> stringCharacters = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        for(Character c: t.toCharArray()){
            stringCharacters.remove(c);
        }
        return stringCharacters.size() == 0;
    }

    public static boolean optimizedIsAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
