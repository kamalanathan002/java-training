import java.util.HashSet;

public class todayproblem {
    public static int value(String s)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        return set.size();
    }
    public static void main(String[] args) {
        String s="pqpqs";
        int k=2;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(value(s.substring(i,j+1))==k)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
