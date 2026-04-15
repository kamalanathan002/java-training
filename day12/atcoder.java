import java.util.Scanner;
class atcoder {
    public static String reverse(String st1,int i,int j)
    {
        StringBuilder sb = new StringBuilder(st1);
        while(i<j)
        {
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1=sc.next();
        String st2=sc.next();
        int n1=st1.length();
        int n2=st2.length();
        if(n1!=n2)
        {
            System.out.println("No");
            return;
        }
        int i=0;
        while(i<n1)
        {
            int j=n1-1;
            if(st1.charAt(i)!=st2.charAt(i))
            {
                while(j>i)
                {
                    if(st1.charAt(j)==st2.charAt(i))
                    {
                        break;
                    }
                    j--;
                }
                if(i==j)
                {
                    System.out.println("No");
                    return;
                }
                st1=reverse(st1,i,j);
            }
            i++;
        }
        if(st1.equals(st2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
