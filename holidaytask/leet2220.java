class leet2220
{
    public static void main(String[] argv)
    {
        int start=3;
        int goal=4;
        int count=0;
        while(start!=0||goal!=0)
        {
            if(((start%2)^(goal%2))==1)
                {
                    count++;
                }   
            start/=2;
            goal/=2;
        }
        System.out.println(count);
    }
}