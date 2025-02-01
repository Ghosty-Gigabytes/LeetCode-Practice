class Solution {
    public boolean isPalindrome(int x) {
        if (x <0){
            return false;
        }
        int N = x;
        int reverse = 0;
        
        while (N>0){
            reverse = reverse*10 + N%10;
            N = N/10;
        }
        if (reverse==x){
            return true;
        }
        return false;
    }
}