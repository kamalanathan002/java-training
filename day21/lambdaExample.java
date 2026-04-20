@FunctionalInterface
interface Ma {
    int add(int a,int b);    
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}
public class lambdaExample {
    public static void main(String[] argv)
    {
        Ma obj=(a,b)->a+b; 
        Exercise ob = ()->System.out.println("Hello"); /*{
            public void sayHello()
            {
                System.out.println("Hello");
            }
        };*/
        ob.sayHello();
        //{
            //@Override
            //public int add(int a,int b)
            //{
            //    return a+b;
          //  }
        //};
        System.out.println(obj.add(11,22));
    }
}
