import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class leet1722
{
    public static void main(String[] argv)
    {
        int[] source={5,1,2,4,3};
        int[] target={1,5,4,2,3};
        int[][] allowedSwaps={{0,4},{4,2},{1,3},{1,4}};
        int s=source.length;
        int t=target.length;
        int n=allowedSwaps.length;
        for(int i=0;i<n;i++)
        {
            int j=0;
            int temp=source[allowedSwaps[i][j]];
            source[allowedSwaps[i][j]]=source[allowedSwaps[i][j+1]];
            source[allowedSwaps[i][j+1]]=temp;
        }
        int count=0;
        for(int i=0;i<s;i++)
        {
            /*if(source[i]!=target[i])
            {
                count++;
            }*/
            System.out.print(source[i]+" ");
        }
        System.out.println(count);
    }
}