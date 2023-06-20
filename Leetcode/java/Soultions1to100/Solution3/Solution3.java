package Soultions1to100.Solution3;

import java.util.HashSet;
import java.util.Set;

class Approach1 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(s == " ") {
            return 1;
        }
        int maxLength = 0;
        for(int i = 0; i < length; i++) {
            for(int j = i+1; j< length; j++) {
                if(allUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }
        return maxLength;
    }

    private static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for(int i = start; i< end; i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
public class Solution3 {
    public static void main(String[] args) {
        String s = "abcabcbb";

        Approach1 approach1 = new Approach1();
        int length = approach1.lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
