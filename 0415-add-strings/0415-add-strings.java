class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()){
            String tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        String out = "";
        int carry = 0;
        int sum = 0;
        for (int i = 1; i <= num1.length(); i++){

            char char1 = num1.charAt(num1.length()-i);
            if (i <= num2.length()){
                char char2 = num2.charAt(num2.length()-i);
                sum = (int) char2 + (int) char1 - 96 + carry;
            }
            else {
                sum = (int) char1 -48 + carry;
                
            }
            carry = 0;
            if (sum > 9){
                carry = sum/10;
                sum = sum%10;
            }
            out = String.valueOf(sum) + out;
        }
        if (carry >0){
            out = carry + out;
        }
        return out;
    }
}