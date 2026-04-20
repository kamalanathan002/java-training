import java.util.function.Supplier;
import java.util.List;
class Person{
    String name="Supplier";
}
class Employee
{
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class supplierExample {
    public static void main(String[] args) {
        Supplier<Integer> s=()->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<Person> p = ()->new Person();
        System.out.println(p.get().name);
        List<Employee> employees=List.of(new Employee("Employee1",222222),new Employee("Employee2",444444));
        
    }
}
