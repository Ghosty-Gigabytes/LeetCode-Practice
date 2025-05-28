class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i = 1; i < strs.length; i++){
            int min = Math.min(strs[i].length(), result.length());
            if (min ==0){
                result = "";
                break;
            }
            for(int j = 0; j < min; j++){
                if (result.charAt(j) != strs[i].charAt(j)){
                    result = result.substring(0,j);
                    break;
                }
                if (j +1 == min){
                    result = result.substring(0, min);
                    break;
                }
            }
        }
        return result;
    }
}