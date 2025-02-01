class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mag = magazine.toCharArray();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for(char s: mag){
            magazineMap.put(s, magazineMap.getOrDefault(s,0)+1);
        }
        char[] ransom = ransomNote.toCharArray();
        for(char r: ransom){
            if(magazineMap.getOrDefault(r,0) <= 0){
                return false;
            }
            else{
                magazineMap.put(r, magazineMap.get(r)-1);
            }
        }
        return true;
    }
}