/*The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

 

Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
 

Constraints:

1 <= s.length <= 105
s[i] is either 'A', 'C', 'G', or 'T'. */
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        
        List<String>a=new ArrayList<>();
        if(s.length()<=10){
            return a;
        }

        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String ans=s.substring(i,i+10);
            map.put(ans,map.getOrDefault(ans,0)+1);
        }

        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                a.add(e.getKey());
            }
        }
        return a;
        
    }
}