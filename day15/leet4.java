import java.util.HashMap;

public class leet4 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
            if(map1.containsKey(ransomNote.charAt(i)))
            {
                map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))+1);
            }
            else
            {
                map1.put(ransomNote.charAt(i),1);
            }
        }
        for(int i=0;i<magazine.length();i++)
        {
            if(map2.containsKey(magazine.charAt(i)))
            {
                map2.put(magazine.charAt(i),map2.get(magazine.charAt(i))+1);
            }
            else{
                map2.put(magazine.charAt(i),1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
    }
}
