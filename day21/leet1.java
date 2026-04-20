class leet1
{
    public static void main(String[] argv)
    {
        int n=25;
        int i=n;
        int rev=0;
        while(i!=0)
        {
            int dig=i%10;
            rev=rev*10+dig;
            i=i/10;
        }
        System.out.println(Math.abs(n-rev));
    }
}