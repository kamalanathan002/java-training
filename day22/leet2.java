import java.util.ArrayList;

public class leet2 {
    public static void main(String[] args) {
        int[] nums1={1,3,5,2,4};
        int[] nums2={6,5,4,3,2,1,7};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            int c=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    for(int k=j;k<nums2.length;k++)
                    {
                        if(nums1[i]<nums2[k])
                        {
                            c=1;
                            list.add(nums2[k]);
                            break;
                        }
                    }
                }
            }
            if(c==0)
            {
                list.add(-1);
            }
        }
        System.out.println(list);
    }
}
