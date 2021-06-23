package easy.firstuniquechar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("zaadadaad"));
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> characters = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!characters.containsKey(s.charAt(i))){
                characters.put(s.charAt(i), 1);
            }else{
                characters.replace(s.charAt(i), characters.get(s.charAt(i))+1);
            }
        }
        int occr = characters.values().stream().
                filter(i -> i == 1)
                .findFirst()
                .orElse(-1);

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            if (entry.getValue().equals(occr)) {
                return s.indexOf(entry.getKey());
            }
        }
        return occr;
    }
}
