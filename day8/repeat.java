public class repeat {
    public static void main(String[] args) {
        String s="abdbac";
        int n=s.length();
        int[] arr = new int[26];
        int index;
        for(int i=0;i<n;i++)
        {
            index=s.charAt(i)-'a';
            if(arr[index]>=1)
            {
                arr[index]++;
            }
            else
            {
                arr[index]=1;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==1)
            {
                char ch=(char)('a'+i);
                System.out.println(ch);
                break;
            }
        }
    }
}
