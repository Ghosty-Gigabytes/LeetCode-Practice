class Solution {
    public int mySqrt(int x) {
        int i = 1;
        int lastVal = 0;
        while (true){
            if(i*i == x){
                return i;
            }
            if (i*i > x){
                return i-1;
            }
            if (i*i < lastVal){
                return i-1;
            }
            lastVal = i*i;
            i++;
        }
    }
}