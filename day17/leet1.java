class leet1
{
    public static void main(String[] argv)
    {
        int[] arr={1,1,2,3,2,1,2};
        int n=arr.length;
        int num=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n&&j!=i;j++)
            {
                for(int k=0;k<n&&k!=i&&k!=j;k++)
                {
                    if((arr[i]==arr[j])&&(arr[j]==arr[k]))
                    {
                        System.out.println("I:"+i+" J:"+j+" K:"+k);
                        num=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        if(num<min)
                        {
                            min=num;
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }
}