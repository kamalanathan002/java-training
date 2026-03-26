class Solution {
    public static void main(String[] argv) {
        String s="RLRRRLLRLL";
        char[] ch = s.toCharArray();
        int n=s.length();
        int l=0,r=0;
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='R'&&i!=n-1)
            {
                if(ch[i+1]=='L')
                {
                    r++;
                }
            }
            if(ch[i]=='L'&&i!=n-1)
            {
                if(ch[i+1]=='R')
                {
                    l++;
                }
            }
        }
        System.out.println(r);
        System.out.println(l);
        System.out.println(Math.max(r,l));
    }
}