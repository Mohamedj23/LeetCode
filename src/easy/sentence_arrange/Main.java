package easy.sentence_arrange;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This problem was asked in an interview by Orange Egypt
 *
 * Description:
 * 1- The problem is to arrange to the given sentence according to its length.
 * 2- If two words with the same length, you must keep their order as in the sentence.
 * 3-First character must be uppercase.
 */

public class Main {

    public static void main(String[] args) {
        String arrangedSentence = arrangeSentence("This is an example");
        System.out.println(arrangedSentence);
    }

    public static String arrangeSentence(String sentence){

        StringBuilder sb = new StringBuilder();

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

        for(String word : sentence.split(" ")){
            hm.put(word, word.length());
        }

        hm.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(e->{
                    sb.append(e.getKey() + " ");
                });

        return sb.substring(0,1).toUpperCase().concat(sb.substring(1)).trim();
    }
}
