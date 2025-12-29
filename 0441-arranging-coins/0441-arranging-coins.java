class Solution {
    public int arrangeCoins(int m) {
        long lastVal = 0;
        int n = 1;
        while(true){
            long sum = (long) n*(n+1)/2;
            if (sum < lastVal){
                System.out.println(sum);
                return n-1;
            }
            if (sum == m){
                return n;
            }
            if (sum > m){
                return n-1;
            }
            lastVal = sum;
            n +=1;
        }
    }
}