import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(i,arr[i]);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                System.out.println(entry.getKey()+"->"+entry.getValue());
            } 
        System.out.println(map.keySet());
    }
}
