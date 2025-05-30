class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() != 0) {
            Integer n = Integer.parseInt(digits);
            int d=0;
            while(n>0){
                d = d*10 + n%10;
                n /=10;
            }
            Map<Integer, String> map = Map.of(
                    2, "abc",
                    3, "def",
                    4, "ghi",
                    5, "jkl",
                    6, "mno",
                    7, "pqrs",
                    8, "tuv",
                    9, "wxyz");
            String val;
            int i = 0;
            while (d > 0) {
                val = map.get(d % 10);
                d /= 10;
                if (i == 0) {
                    for (int j = 0; j < val.length(); j++) {
                        list.add(String.valueOf(val.charAt(j)));
                    }
                } else {
                    ListIterator<String> it = list.listIterator();
                    while (it.hasNext()) {
                        int j = 0;
                        String s = it.next();
                        it.remove();
                        while (j < val.length()) {
                            String temp = "" + s + val.charAt(j);
                            it.add(temp);
                            j++;
                        }
                    }
                }
                i++;
            }
        }
        return list;
    }
}