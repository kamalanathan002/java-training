public class sam {
    public static void main(String[] args) {
       int x=5;
       int y=25;
       int n=3;
       for(int i=25;i>=5;i--)
       {
        if(i%n==0)
        {
            if(i>=10)
            {
                System.out.printf("%d ",(i%10)*i);
            }
            else{
                System.out.printf("%d ",i*i);
            }
        }
       }
    }
}
