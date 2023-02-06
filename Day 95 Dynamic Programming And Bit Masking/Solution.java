/*  Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces. */

import java.util.Arrays;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();


        final byte[] countTemplate = new byte[]{
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
        };


        final byte[] strBytes = s.getBytes();
        int endPos = 0, startPos = 0, max = 1;

        countTemplate[strBytes[0]-32]=1;
        int size=1;

        for(endPos = 1; endPos<s.length(); endPos++){
            while(countTemplate[strBytes[endPos]-32]==1){
                countTemplate[strBytes[startPos]-32]=-1;
                size--;
                startPos++;
            }

            countTemplate[strBytes[endPos]-32]=1;
            size++;
            max = Math.max(max, size);
        }

        return max;
    }
}