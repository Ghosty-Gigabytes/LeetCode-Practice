class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l1 !=0 && l2 !=0){
            int i = 0;
            while(i+l2 <=l1){
                if (haystack.substring(i, i+l2).equals(needle)){
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}