/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
 

Constraints:

1 <= s.length <= 300
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 20
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.*/

class Solution {
    private class TrieNode {
        TrieNode[] children;
        boolean endOfWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.endOfWord = false;
        }
    }

    private TrieNode root;

    public boolean wordBreak(String s, List<String> wordDict) {
        root = new TrieNode();
        for (String word : wordDict) {
            insert(word);
        }

        int n = s.length();
        boolean[] dp = new boolean[n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (isPresent(s, i, j)) {
                    dp[j] = (i - 1 >= 0) ? dp[i - 1] : true;
                    if (dp[j]) break;
                }
            }
        }
        
        return dp[n - 1];
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int i = ch - 'a';
            if (node.children[i] == null) {
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        node.endOfWord = true;
    }

    private boolean isPresent(String word, int start, int end) {
        TrieNode node = root;
        for (int i = start; i <= end; i++) {
            int ch = word.charAt(i) - 'a';
            if (node.children[ch] == null) {
                return false;
            }
            node = node.children[ch];
        }
        return node.endOfWord;
    }
}