import java.util.HashMap;

public class leet1 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        int[] arr = new int[2];
        int n= arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsValue(nums[i]))
            {
                map.put(map.containsKey(nums[i])+1,nums[i]);
            }
            else
            {
                map.put(1,nums[i]);
            }
        }
    }
}
