class Solution {
    public boolean isValid(String s) {
         ArrayList<Character> list = new ArrayList<>();
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[' ){
                list.add(c);
            }
            else if (!list.isEmpty() && c == '}'){
                if (!list.isEmpty() && list.getLast() != '{'){
                    isValid = false;
                    break;
                }
                else{
                    list.removeLast();
                }
            }
            else if (!list.isEmpty() && c == ')'){
                if (!list.isEmpty() && list.getLast() != '('){
                    isValid = false;
                    break;
                }
                else{
                    list.removeLast();
                }
            }else if (!list.isEmpty() && c == ']'){
                if (!list.isEmpty() && list.getLast() != '['){
                    isValid = false;
                    break;
                }
                else{
                    list.removeLast();
                }
            }
            else{
                isValid = false;
                return isValid;
            }
        }
        if (list.isEmpty()){
            return isValid;
        }else{
            return false;
        }
    }
}