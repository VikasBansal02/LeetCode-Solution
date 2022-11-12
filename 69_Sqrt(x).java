class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0){
            return x;
        }
        long lo = 0;
        long hi = x/2;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid > x)
                hi = mid-1;
            else
                lo = mid+1;
        }
        return (int)hi;
    }
}
