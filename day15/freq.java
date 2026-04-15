import java.util.HashMap;

public class freq {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3,2,1,2,3,6,7};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
