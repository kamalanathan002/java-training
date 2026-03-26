import java.util.ArrayList;

public class exp {
     public static void main(String[] args) {
        String str="cRICkEt";
        char[] arr = str.toCharArray();
        int n=3;
        int len=str.length();
        int j=0,k=0;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            while(j<len)
            {
                if(Character.isLowerCase(arr[j]))
                {
                    list.add(arr[j]);
                    j++;
                    break;
                }
                j++;
            }
            while(k<len)
            {
                if(Character.isUpperCase(arr[k]))
                {
                    list.add(arr[k]);
                    k++;
                    break;
                }
                k++;
            }
        }
        System.out.println(list);
    }
}
