
class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        if (strs.length == 0){
            return "";}

        // Start from first char and keep increasing the index 
        //   as long as all the other string match the character
        //   or no strings lenth is smaller than that
   
      
        for(int i=0; i<strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i))
                    return strs[0].substring(0, i);
                
                //System.out.println(i + " - " + strs[0].substring(0, i+1) + ", check - " + strs[j]);
            }
        }
        return strs[0];
       }
    }