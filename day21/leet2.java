public class leet2 {
    public static void main(String[] args) {
        String[] words={"a","b","leetcode"};
        String target="leetcode";
        int startIndex=0;
        int i=startIndex;
        int c1=0,c2=0;
        int n=words.length;
        for(int j=0;j<n;j++)
        {
            if(words[i].equals(target))
            {
                c1=j;
                break;
            }
            i=(i+1)%n;
        }
        i=startIndex;
        for(int j=0;j<n;j++)
        {
            if(words[i].equals(target))
            {
                c2=j;
                break;
            }
            i=(i-1+n)%n;
        }
        System.out.println(Math.min(c1,c2));
    }
}
