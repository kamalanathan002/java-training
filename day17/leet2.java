public class leet2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k=3;
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                   c++;
                }
            }
        }
        System.out.println(c);
    }
}
