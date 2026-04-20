class leet1
{
    public static void main(String[] argv)
    {
        int[] colors={1,8,3,8,3};
        int n=colors.length;
        int max=0;
        int max1=0;
        int i=0;
        int j=n-1;
        while(j>=0)
        {
            if(colors[i]!=colors[j])
            {
                int c=j-i;
                if(max<c)max=c;
            }
            j--;
        }
        i=n-1;
        j=0;
        while(j<n)
        {
            if(colors[i]!=colors[j])
            {
                int c=j-i;
                if(max1<c)max1=c;
            }
            j++;
        }
        System.out.println(Math.max(max,max1));
    }
}