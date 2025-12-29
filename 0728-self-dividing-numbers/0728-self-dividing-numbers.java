class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if (i%10 == 0){
                continue;
            }
            int num = i;
            boolean isSelfDividing = true;
            while (num >0){
                    if (i%(num%10)==0 && num%10 != 0){
                    num = num/10;
                }
                else{
                    isSelfDividing=false;
                    break;
                }
            }
            if (isSelfDividing){
                list.add(i);
            }

        }
        return list;
    }
}