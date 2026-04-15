class leet1
{
    public static void main(String[] args) {
        int[][] arr ={{0,1,-1},{1,-2,3},{2,-3,4}};
        int row=arr.length;
        int col=arr[0].length;
        int i=0,j=0;
        int total=0;
        int max=0;
        int neq=0;
        while(i<row)
        {
            while(j<col)
            {
                if(arr[i][j]>=0)
                {
                    total=total+arr[i][j];
                    j++;
                }
                else if(j<col-1&&i<row-1&&arr[i][j+1]<arr[i+1][j])
                {
                    if(arr[i+1][j]<0&&neq<2)
                    {
                        neq++;
                    }
                    else
                    {
                        total=total+arr[i+1][j];
                        j++;
                    }
                }
                else if(j<col-1&&i<row-1&&arr[i][j+1]>arr[i+1][j])
                {
                    if(arr[i][j+1]<0&&neq<2)
                    {
                        neq++;
                    }
                    else
                    {
                        total=total+arr[i][j+1];
                        j++;
                    }
                    i++;
                    j=0;
                }
            }
            if(max<total)
            {
                max=total;
            }
        }
        System.out.println(max);
    }
}