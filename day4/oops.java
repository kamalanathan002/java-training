class Student
{
    int id;
    String name;
    double price;
    int quantity;
    Student(int id,String name,double price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    void display()
    {
        System.out.println("Product ID: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
        System.out.println("Product quantity: "+quantity);
    }
    double totalPrice()
    {
        return price*quantity;
    }
}
public class oops {
    public static void main(String[] argv)
    {
        Student s1= new Student(1,"abc",2,3);
        System.out.println("Total Price: "+s1.totalPrice());
        s1.display();
    }
}