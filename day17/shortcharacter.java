import java.util.ArrayList;
import java.util.HashMap;

public class shortcharacter {
    public static void main(String[] args) {
        String s="aabaack";
        int max=0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
            if(max<map.get(ch))
            {
                max=map.get(ch);
            }
        }
        ArrayList<Character> list = new ArrayList<>();
        while(max>0)
        {
            for(Character key:map.keySet())
            {
                if(max==map.get(key))
                {
                    list.add(key);
                }
            }
            max--;
        }
        System.out.println(list);
    }
}
