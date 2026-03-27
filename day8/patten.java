public class patten {
    public static void main(String[] args) {
        String s="hellohi";
        int n=s.length();
        int p=0;
        int q=n-1;
        int spac=n/2;
        int c=0;
        for(int j=0;j<n;j++)
        {
            System.out.printf("%c",s.charAt(p));
            for(int i=1;i<=spac;i++)
            {
                System.out.print(" ");
            }
            System.out.printf("%c",s.charAt(q));
            System.out.println();
            if(spac!=0&&c==0)
            {
                spac--;
            }
            else
            {
                spac++;
                c++;
            }
            p++;
            q--;
        }
    }
}
