class Solution {
    public boolean isPalindrome(int x) {
    int temp = x;
        
    
        if(x<0){
          
            return false;
            
        }
          int  reversed =0;
        while(x>0){
         reversed = (x%10)+reversed*10;
            
            x/=10;
        }
        
      
        
        if(reversed == temp){
            return true;
        }
        
          return  false;
      
    }
} 
  
