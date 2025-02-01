class Solution {
    public int reverse(int x) {
        
        int N = x;
        int count = 0;
        int reverse = 0;
        int newRev = 0;
        if (x <0){
                N = -N;
            }
        while (N>0){
            newRev = reverse*10 + N%10;
            if ((newRev - N%10)/10 != reverse){
                return 0;
            }
            reverse = newRev;
            N = N/10;
        }
        
        if (x <0){
                reverse= -reverse;
            }
        
        return reverse;
    }
}