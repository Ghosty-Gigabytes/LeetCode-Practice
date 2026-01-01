class Solution {
    public int lengthOfLongestSubstring(String s) {
        int out = 0;
        int last = 0;
        String longWord = "";
        int i = 0;
        while (i < s.length()){
            if (longWord.contains(Character.toString(s.charAt(i)))){
                i = s.indexOf(longWord, last);
                last = i+1;
                longWord = "";
            
            }
            else{
                longWord = longWord + Character.toString(s.charAt(i));
                //System.out.println(longWord);
                if (out < longWord.length()){
                    out = longWord.length();
                }
            }
            i++;
        }
        //System.out.println(longWord);
        return out;
    }
}