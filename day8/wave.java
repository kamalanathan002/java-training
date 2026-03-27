class wave
{
    public static void main(String[] argv)
    {
        String s="  clear";
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(i%2==0&&s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
            }
            else if(i%2!=0&&s.charAt(i)!=' '){
                sb1.append(s.charAt(i));
            }
        }
        sb.append(sb1);
        String res=sb.toString();
        System.out.println(res);
    }
}