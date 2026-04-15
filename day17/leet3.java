import java.util.ArrayList;
import java.util.HashMap;
class leet3
{
    public static ArrayList<Integer> value(int[] nums,int m)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == m)
            {
                list.add(i);   // store all indices
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int count=0;
            int m=nums[i];
            map.put(m,map.getOrDefault(m,0)+1);
            System.out.println(map);
            if(map.get(m)>=3)
            {
                System.out.println("M: "+m);
                ArrayList<Integer> arr = value(nums, m);
                for(int j = 0; j <= arr.size() - 3; j++)
                {
                    int a = arr.get(j);
                    int b = arr.get(j+1);
                    int c = arr.get(j+2);

                    count = Math.abs(a-b) + Math.abs(b-c) + Math.abs(c-a);
                    if(min > count)
                    {
                        min = count;
                    }
                }
            }
        }
        System.out.println(min);
    }
}