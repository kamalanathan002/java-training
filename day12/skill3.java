import java.util.HashSet;
public class skill3 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        String[] st = {"aaaaaaaaaa ","abdwjdkjwjddcbakd","abcdefghi"};
        int n=st.length;
        int max=0,index=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<st[i].length();j++)
            {
                set.add(st[i].charAt(j));
            }
            if(max<set.size())
            {
                max=set.size();
                index=i;
            }
            set.clear();
        }
        System.out.println(st[index]);
    }
}
