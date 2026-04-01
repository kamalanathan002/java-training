import java.util.HashSet;

public class leet3 {
    public static void main(String[] args) {
        String st="pwwkew";
        int n=st.length();
        int max=0;
        int left=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            char current=st.charAt(i);
            while(set.contains(current))
            {
                set.remove(st.charAt(left));
                left++;
            }
            set.add(current);
            max=Math.max(max, i-left+1);
        }
        System.out.println(max);
    }
}
