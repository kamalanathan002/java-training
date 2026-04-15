public class Atcoder2 {
    public static void main(String[] args) {
        String s1="aaaaa";
        String s2="a";
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                if(s2.equals(s1.substring(i,j)))
                {
                    continue;
                }
                else
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
