class Solution {
    public int maxProduct(int n) {
        int large = 0;
        int secondLarge = 0;
        while (n > 0){
            int lastDigit = n%10;
            n = n/10;
            if (lastDigit < secondLarge){
                continue;
            }
            if (lastDigit >= secondLarge && lastDigit < large){
                secondLarge = lastDigit;
            }
            if (lastDigit >= large){
                secondLarge = large;
                large = lastDigit;
            }
        }
        return large*secondLarge;
    }
}