public class rotation {
    public static void main(String[] args) {
        int x=5,y=10;
        int n=y-x+1;
        int x1=x;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            int nu=x;
            int temp=x1;
            for(int j=0;j<n;j++)
            {
                if(nu==y+1&&j<n)
                {
                    arr[i][j]=temp;
                    
                    temp++;
                }
                else
                {
                    arr[i][j]=nu;
                    nu++;
                }
            }
            x++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}