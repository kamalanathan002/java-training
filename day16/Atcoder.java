import java.util.Scanner;

public class Atcoder {
    public static int[] even(int[] arr)
    {
        for(int i=0;i<arr.length-1;i=i+2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
    public static int[] odd(int[] arr)
    {
        arr[0]=1;
        arr[1]=3;
        arr[2]=2;
        for(int i=3;i<arr.length-1;i=i+2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        if(n%2==0)
        {
            arr=even(arr);
        }
        else{
            if(n==3)
            {
                arr[0]=1;
                arr[1]=3;
                arr[2]=2;
            }
            else
            {
                arr=odd(arr);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
