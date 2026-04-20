public class leet2 {
    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        int n=s.length;
        int c=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s[0].length();i++)
        {
            c=1;
            for(int j=1;j<n;j++)
            {
                if(s[0].charAt(i)==s[j].charAt(i))
                {
                    c++;
                }
            }
            if(c!=n)
            {
                break;
            }
            sb.append(s[0].charAt(i));
        }
        System.out.println(sb.toString());
    }
}
