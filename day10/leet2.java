import java.util.ArrayList;
public class leet2 {
    public static boolean reverse(String st)
    {
        int l=0;
        int r=st.length()-1;
        while(l<r)
        {
            if(st.charAt(l)!=st.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="babad";
        int n=str.length();
        int max=0;
        String st="";
        ArrayList<String> list1 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                st=str.substring(i,j+1);
                int len=j-i+1;
                if(reverse(st))
                {
                    if(max<len)
                    {
                        max=len;
                        list1.clear();
                        list1.add(st);
                    }
                }
            }
        }
        System.out.println(list1);
    }
}
