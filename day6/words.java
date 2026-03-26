public class words
{
    public static void main(String[] args) {
        String s="How   are you";
        int count=0;
        int n1=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' '&&n1==0)
            {
                count++;
                n1++;
            }
            else if(s.charAt(i)==' ')
            {
                n1=0;
            }
        }
        System.out.println(count);
    }
}