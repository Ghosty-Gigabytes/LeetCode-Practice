class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() !=0 &&needle.length() !=0){
            int i = 0;
            while(i+needle.length() <=haystack.length()){
                if (haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}