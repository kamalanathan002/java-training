public class sam1 {
    public static void main(String[] args) {
        String str="machine";
        int le=str.length();
        int n=0;
        int c=0;
        for(int i=0;i<le;i++)
        {
            for(int j=i;j<=n;j++)
            {
                    if(le-1<j)
                    {
                        System.out.printf("* ");
                        c++;
                    }
                    else
                    {
                        System.out.printf("%c",str.charAt(j));
                    }
            }   
            System.out.println();
            if(c>0)
            {
                break;
            }
            n=n+2;
        }
    }
}
