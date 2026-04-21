import java.util.HashMap;

public class leet1781 {
    public static int value(String s1)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>max)
            {
                max=map.get(ch);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int val : map.values()) {
            if(val < min) {
                min = val;
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        String s="aabcb";
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String s1=s.substring(i,j+1);
                int c=value(s1);
                count=count+c;
            }
        }
        System.out.println(count);
    }
}
