class leet1
{
    public static void main(String[] args) {
        String[] words={"ibkgecmeyx","jsdkekkjsb","gdjgdtjtrs","jsdkekkjsb","jsdkekkjsb","jsdkekkjsb","gdjgdtjtrs","msjlfpawbx","pbgjhutcwb","gdjgdtjtrs"};
        String target="pbgjhutcwb";
        int n=words.length;
        int startIndex=0;
        int c1=Integer.MAX_VALUE;
        int c2=Integer.MAX_VALUE;
        int c3=0;
        int step=0;
        for(int i=startIndex;i<n;i++)
        {
            if(words[i].equals(target))
            {
                if(c1>i)c1=step;
                c3=1;
                System.out.println(c1);
                System.out.println("s: "+step);
            }
            step++;
        }
        step=n-1;
        for(int i=n-1;i>=startIndex;i--)
        {
            if(words[i].equals(target))
            {
                if(c2>i)c2=(n)-step;
                System.out.println(c2);
                System.out.println("s: "+step);
            }
            step++;
        }
        if(c3==1)System.out.print(Math.min(c1,c2)+1);
        else System.out.print(-1);
    }
}