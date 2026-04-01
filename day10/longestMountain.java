import java.util.ArrayList;

public class longestMountain {
    public static ArrayList<Integer> subarray(int[] arr,int i, int j){
        ArrayList<Integer> list = new ArrayList<>();
        for(int k=i;k<j;k++)
        {
            list.add(arr[k]);
        }
        return list;
    }
    public static int mountain(ArrayList<Integer> list)
    {
        int medium=list.size()-1;
        int l=0,r=list.size()-1;
        while(l<r && medium!=l && medium!=r)
        {
            if(!(list.get(medium)>list.get(l)&&list.get(medium)>list.get(r)))
            {
                return 0;
            }
            l++;
            r--;
        }
        return list.size();
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,7,3,2,5};
        int n=arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                list1=subarray(arr,i,j+1);
                if(list1.size()>=3&&list1.size()%2!=0)
                {
                    int len=mountain(list1);
                    if(len!=0&&max<len)
                    {
                        max=len;
                        list.clear();
                        list.addAll(list1);
                    }
                }
                list1.clear();
            }
        }
        System.out.println(list);
    }
}
