public class leet1 {
    public static void main(String[] args) {
        String str1="TFTF";
        String str2="abc";
        int n=str1.length();
        int m=str2.length();
        int p=n;
        char[] word = new char[n+m-1];
        char[] ch=str2.toCharArray();
        int i=0;
        int j;
        int k=0;
        while(k<(n+m-1))
        {
            if(str1.charAt(i)=='T'&&k!=n)
            {
                k=i;
                for(j=0;j<m;j++)
                {
                    word[k]=ch[j];
                    k++;
                }
            }
            else
            {
                word[k]='a';
                k++;
            }
            if(i<n)
            {
                i++;
            }
        }
        for(int e=0;e<(n+m-1);e++)
        {
            System.out.printf("%c",word[e]);
        }
    }
}
