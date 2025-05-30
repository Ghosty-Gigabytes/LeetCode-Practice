class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() != 0) {
            Map<String, String> map = Map.of(
                    "2", "abc",
                    "3", "def",
                    "4", "ghi",
                    "5", "jkl",
                    "6", "mno",
                    "7", "pqrs",
                    "8", "tuv",
                    "9", "wxyz");
            String val;
            int i = 0;
            while (i < digits.length()) {
                val = map.get(""+digits.charAt(i));
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
                            System.out.println(temp);
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