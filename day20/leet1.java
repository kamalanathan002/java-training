class leet1
{
    public static boolean value(int n,int m)
    {
        int s=0;
        while(n!=0)
        {
            s=s*10+(n%10);
            n=n/10;
        }
        if(s==m)return true;
        return false;
    }
    public static void main(String[] argv)
    {
        int[] nums={120,21};
        int n=nums.length;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(value(nums[i],nums[j]))
                {
                    c=Math.abs(i-j);
                    if(min>c)
                    {
                        min=c;
                    }
                }
            }
        }
        System.out.println(min);
    }
}