class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean flag = false;
        int lo=0;
        int hi = letters.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(letters[mid]> target){
                flag = true;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        if(flag)
            return letters[lo];
        return letters[0];
    }
}
