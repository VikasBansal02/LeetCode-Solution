
class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int i = 0;
        int res = 0;
        while(i < n){
            if(s.charAt(i) == 'X'){
                i+=3;
                res++;
            }
            else
                i+=1;
        }
        return res;
    }
}
