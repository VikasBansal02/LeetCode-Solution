class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int peri=0;
        for(int x=0;x<nums.length-2;x++)
        {
            if((nums[x]+nums[x+1]>nums[x+2]) && (nums[x]+nums[x+2]>nums[x+1]) && (nums[x+1]+nums[x+2]>nums[x]))
            {
                if(nums[x]+nums[x+1]+nums[x+2]>peri)
                {
                    peri=nums[x]+nums[x+1]+nums[x+2];
                }
            }
        }
        return peri;
        
    }
}
