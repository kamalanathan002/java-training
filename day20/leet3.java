import java.util.ArrayList;
import java.util.HashMap;

public class leet3 {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 1, 2, 1, 1};
        int n=nums.length;
        int n1=n/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int m=nums[i];
            map.put(m,map.getOrDefault(m, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key:map.keySet())
        {
            if(map.get(key)>n1)
            {
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
