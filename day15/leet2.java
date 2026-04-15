import java.util.HashSet;

public class leet2 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,4};
        int[] nums2={2,2};
        HashSet<Integer> set = new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums1[j]==nums2[i])
                {
                    set.add(nums2[i]);
                }
            }
        }
        System.out.println(set);
    }
}
