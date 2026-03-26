class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            sum++;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==(nums[j]))
                {
                    sum++;
                }
            }
            map.put(sum,nums[i]);
        }
        int max=0;
        for(int key:map.keySet())
        {
            if(key>max)
            {
                max=key;
            }
        }
        return map.get(max);
    }
}