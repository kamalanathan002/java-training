class leet1
{
    public static int[] mulit(int[] num,int l,int r,int k,int v)
    {
        while(l<=r)
        {
            num[l]=num[l]*v % (1000000007);
            l=l+k;
        }
        return num;
    }
    public static void main(String[] argv)
    {
        int[] num={2,3,1,5,4};
        int[][] qu={{1,4,2,3},{0,2,1,2}};
        int n=num.length;
        int m=qu.length;
        for(int i=0;i<m;i++)
        {
            num=mulit(num,qu[i][0],qu[i][1],qu[i][2],qu[i][3]);
        }
        int count=num[0];
        for(int i=1;i<n;i++)
        {
            count=count^num[i];
        }
        System.out.println(count);
    }
}