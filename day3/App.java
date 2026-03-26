class User
{
    String name;
    String phone;
    String address;
    User(String name)
    {
        this.name=name;
        System.out.println("User creater");
    }
}
class Driver extends User
{
    String role ="Driver";
    Driver(String name,String role)
    {
        super(name);
        System.out.println("")
    }
}
class FoodUser extends User{
    String favouriteFood;
}
class TravelUser extends User{
    String PreferredVechicle;
}
public class App {
    
}
