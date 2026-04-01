import java.util.ArrayList;

public class leet3 {
    public static void main(String[] argv)
    {
        int[] arr ={4,5,2};
        int n=arr.length;
        int i=0;
        int j=1;
        int c=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<n)
        {
            if(j<n && arr[i]>arr[j])
            {
                c=1;
                j++;
            }
            else if(j==n && c>0)
            {
                list.add(arr[i]);
                c=0;
                i++;
                j=j+1;
            }
            else 
            {
                c=0;
                i++;
                j=i+1;
            }
        }
        list.add(arr[n-1]);
        System.out.println(list);
    }
}