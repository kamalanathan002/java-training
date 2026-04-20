import java.util.Arrays;

public class leet3 {
    public static void main(String[] args) {
        int[] nums={-5,-7,-5,-7,-5};
        int lower=-12;
        int upper=-12;
        int n=nums.length;
        Arrays.sort(nums);
        //System.out.println(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]);
        int i=0;
        int j=1;
        int count=0;
        while(i<n-1)
        {
            int s=nums[i]+nums[j];
            if(s>=lower&&s<=upper)
            {
                count++;
            }
            if(nums[j]>upper||j==n-1)
            {
                i++;
                j=i;
            }
            j++;
        }
        System.out.println(count);
    }
}
