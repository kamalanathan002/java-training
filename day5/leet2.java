class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                return nums[i];
            }
        }
        return 0;
    }
}