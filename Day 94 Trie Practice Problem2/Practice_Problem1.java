/*  Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

Example 1:

Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]
Example 2:

Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []
 

Constraints:

1 <= s.length <= 20
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 10
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique. */

class Solution {
    private List<String> sentences;

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        sentences = new ArrayList<>();
        wordBreak(words, s, 0, "");
        return sentences;
    }

    private void wordBreak(Set<String> words, String s, int i, String sentence) {
        if (i == s.length()) {
            sentences.add(sentence);
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String word = s.substring(i, j + 1);
            if (words.contains(word)) {
                if (sentence.length() == 0) {
                    wordBreak(words, s, j + 1, sentence + word);
                } else {
                    wordBreak(words, s, j + 1, sentence + " " + word);
                }
            }
        }
    }
}