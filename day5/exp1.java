import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        int p=n;
        int R;
        for(int i=1;i<=n;i++)
        {
            R=m;
            for(int j=1;j<=n;j++)
            {
                System.out.printf("%d ",m);
                if(m==p)
                {
                    for(int k=m-1;k>=R;k--)
                    {
                        System.out.printf("%d ",k);
                    }
                    //m=p+1;
                    p=p+n;
                    System.out.println();
                }
                m++;
            }
        }
    }
}
