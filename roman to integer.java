class Solution {
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int s1=getValue(s.charAt(i));
            if(i+1<s.length()){
                int s2=getValue(s.charAt(i+1));
                if(s1>=s2)
                    res = res+s1;
                else{
                    res = res+s2-s1;
                    i++;
                }
            }
            else
                res=res+s1;
        }
        return res;
    }
    public int getValue(char s){
        if(s=='I')
            return 1;
        if(s=='V')
            return 5;
        if(s=='X')
            return 10;
        if(s=='L')
            return 50;
        if(s=='C')
            return 100;
        if(s=='D')
            return 500;
        if(s=='M')
            return 1000;
        return -1;
    }


//method 2 much less efficient

    class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                    result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
                } else {
                    result += map.get(s.charAt(i));
                }
            }
            return result;
    }
}

// if for ex XC = 90 but in first loop we get 10 +100 = 110 so to get we have to subtract C - 2*x