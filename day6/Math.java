class calculator
{
    int add(int num1,int num2)
    {
        return num1+num2;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}
public class Math
{
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(1.5,1.4));
    }
}