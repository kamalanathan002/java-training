import java.util.HashMap;
import java.lang.Math;
public class leet3 {
    public static int value(int n)
    {
        StringBuilder re=new StringBuilder(String.valueOf(n));
        String s=re.reverse().toString();
        int s1=Integer.parseInt(s);
        return s1;
    }
    public static void main(String[] args) {
        int[] nums={120,21};
        int n=nums.length;
        int c1=0;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int rev=value(nums[i]);
            System.out.println(rev);
            if(map.containsKey(rev))
            {
                int m=map.get(rev);
                System.out.println(m);
                int c=Math.abs(i-m);
                if(min>c)
                {
                    min=c;
                    c1=1;
                }
            }
            else
            {
                map.put(rev,i);
            }
        }
        System.out.println(min);
    }
}
