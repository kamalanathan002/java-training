import java.util.ArrayList;

class leet1
{
    public static ArrayList<Integer> pop(ArrayList<Integer> list,int value,int p)
    {
        if(p==0)
        {
            return list;
        }
        if(list.get(p-1)>value)
        {
            list.set(p-1,list.get(p-1)-1);
        }
        else if(list.get(p-1)<value)
        {
            list.set(p-1,value-1);
        }
        else
        {
            list.remove(p-1);
        }
        return list;
    }
    public static void main(String[] argv)
    {
        int[] pos={1,2,5,6};
        int[] hel={10,10,11,11};
        String di="RLRL";
        int n=hel.length;
        int p=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(di.charAt(i)=='R')
            {
                list.add(hel[i]);
            }
            else
            {
                p=list.size();
                list=pop(list,hel[i],p);
            }
        }
        System.out.println(list);
    }
}