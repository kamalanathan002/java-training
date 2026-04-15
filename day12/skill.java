public class skill {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1,5};
        int n=arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        System.out.println(dp[n-1]);
    }
}
