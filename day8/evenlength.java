public class evenlength {
    public static void main(String[] args) {
        String s="Words with even length kamala nathan";
        int n=s.length();
        int p=0;
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<n)
        {
            int count=0;
            if(s.charAt(i)!=' ')
            {
                while(p < n && s.charAt(p) != ' ')
                {
                    sb.append(s.charAt(p));
                    p++;
                    count++;
                }
                if(count%2==0)
                {
                    System.out.print(sb.toString()+" ");
                }
                sb.setLength(0);
                i+=count;
            }
            i++;
            p=i;
        }
    }
}
