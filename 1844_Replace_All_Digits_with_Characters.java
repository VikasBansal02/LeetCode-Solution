class Solution {
    public String replaceDigits(String s) {
        String ans="";
        ans+= s.charAt(0);
        char c;
        for(int i=1;i<s.length();i++){
            if(i%2==0){
                ans+= s.charAt(i);
            }
            else{
                c =(char) (s.charAt(i-1) + (int)s.charAt(i)-'0');
                ans += c;
            }
        }
        return ans;
    }
}
