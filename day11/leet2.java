public class leet2 {
    public static int[] subarray(int[] arr,int p,int k)
    {
        int[] arr1 = new int[k];
        int j=0;
        for(int i=p;i<k;i++)
        {
            arr1[j]=arr[i];
            j++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5};
        int x=-1;
        int k=4;
        int n=arr.length;
        int p=0;
        int[] result=null;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                p=(k-1)-i;
                result=subarray(arr,p,k);
            }
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.printf("%d ",result[i]);
        }
    }
}
