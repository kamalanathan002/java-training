import java.util.Scanner;

public class Atcoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        if(s.charAt(0)=='o')
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)!='o')
                {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
        else
        {
            System.out.println(s);
        }
    }
}
