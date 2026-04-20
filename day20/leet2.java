import java.util.ArrayList;
import java.util.HashMap;

public class leet2 {
    public static void main(String[] args) {
        String s="AAAAAAAAAAAAA";
        int n=s.length();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<=n-10;i++)
        {
            String ch=s.substring(i,i+10);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String key:map.keySet())
        {
            if(map.get(key)>1)
            {
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
