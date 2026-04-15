public class skill2 {
    public static int largestunique(String st)
    {
        int n=st.length();
        int len=n;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(st.charAt(i)==st.charAt(j))
                {
                    len--;
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String[] st = {"aaaaaaaaaa ","abdwjdkjwjddcbakd","abcdefghi"};
        int n=st.length;
        int max=0,index=0;
        for(int i=0;i<n;i++)
        {
            int len=largestunique(st[i]);
            if(max<len)
            {
                index=i;
                max=len;
            }
        }
        System.out.println(st[index]);
    }
}
