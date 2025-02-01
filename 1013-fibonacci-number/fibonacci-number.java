class Solution {
    static int sum = 0;
    public int fib(int n) {
        if(n==1){
            sum = 1;
            return sum;
        }
        if(n==0){
            sum = 0;
            return sum;
        }
        sum = fib(n-1) + fib(n-2);
        return sum;
    }
}