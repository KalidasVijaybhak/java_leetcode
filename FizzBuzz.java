class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> current = new ArrayList<>();
        for(int i = 1;i<=n;i++){
           if(i%3 == 0 && i%5 == 0){
                current.add("FizzBuzz");
            } 
            else if(i%3==0){
                current.add("Fizz");
            }
            else if(i%5 == 0){
                current.add(  "Buzz");
            }
            
            else{
               current.add(String.valueOf(i)); 
            }
        }
        return current;
    }
}