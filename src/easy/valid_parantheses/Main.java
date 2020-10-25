package easy.valid_parantheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.isValid("[[[]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> validParentheses = initializeValidParenthesesMap();
        boolean isValid = false;

        if (s.length() % 2 != 0)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (validParentheses.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && validParentheses.get(stack.pop()).equals(s.charAt(i))) {
                    isValid = true;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? isValid : false;
    }

    private static Map<Character, Character> initializeValidParenthesesMap() {
        HashMap<Character, Character> validParenthesesMap = new HashMap<>();
        validParenthesesMap.put('(', ')');
        validParenthesesMap.put('[', ']');
        validParenthesesMap.put('{', '}');

        return validParenthesesMap;
    }
}
