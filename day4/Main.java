public class Main {
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int square(int n)
    {
        return mul(n,n);
    }
    public void print(int n)
    {
        System.out.println(square(n));
    }
    public static void main(String[] argv)
    {
       int s=4;
       Main m = new Main();
       m.print(s);
    }
}
