class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int temp=n;
        HashSet <Integer> num=new HashSet<Integer>();
        while(sum!=1&& !num.contains(sum))
        {
            num.add(temp);
            sum=0;
            while(temp>0)
            {
                int dig=temp%10;
                sum=sum+(dig*dig);
                temp=temp/10;
            }
            temp=sum;
        }
        return temp==1;
    }
}