class Solution {
    public int secondHighest(String s) {
       boolean [] found=new boolean [10];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9')
                found[ch-'0']=true;
        }
        int smax=0;
        for(int digit=9;digit>=0;digit--){
            
            if(found[digit]){
                if(++smax==2)
                return digit;
             }
            
        }
        return -1;
    }
}
