class Solution {
    public int lengthOfLastWord(String s) {
        boolean isWord = false;
        int count = 0;
        for(int i = s.length()-1; i >=0; i--){
            if (isWord && s.charAt(i) == ' '){
                break;
            }
            if (s.charAt(i) != ' '){
                isWord = true;
                count++;
            }
        }
        if (count > 1){
            return count;
        }
        return count;
    }
}