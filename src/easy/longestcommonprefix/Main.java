package easy.longestcommonprefix;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"dog","race","car"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];

        char[] firstWordCharacters = strs[0].toCharArray();
        int prefixCount = 100;

        for (int i = 1; i < strs.length; i++) {
            int lastCommonPrefixCount = getLastCommonPrefixCount(strs[i], firstWordCharacters);
            if(lastCommonPrefixCount < prefixCount)
                prefixCount = lastCommonPrefixCount;
        }

        return strs[0].substring(0,prefixCount);
    }

    private static int getLastCommonPrefixCount(String str, char[] firstWordCharacters) {
        int count = 0;
        int length = Math.min(str.length(), firstWordCharacters.length);

        for (int i = 0; i < length; i++) {
            if(str.charAt(i) == firstWordCharacters[i]){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
