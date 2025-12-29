class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<n; i++){
            i+=1;
            if (i %15 ==0){
                list.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                list.add("Buzz");
            }
            else if (i % 3 == 0){
                list.add("Fizz");

            }
            else{
                list.add(String.valueOf(i));
            }
            i-=1;
        }
        return list;
    }
}