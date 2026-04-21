public class leet1781opt {
    public static void main(String[] args) {
        String s="aabcb";
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int[] freq=new int[26];
            for(int j=i;j<n;j++)
            {
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++)
                {
                   if(freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
                count=count+(max-min);
            }
        }
        System.out.println(count);
    }
}
