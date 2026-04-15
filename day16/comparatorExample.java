import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class student{
    int id;
    String name;
    int mark;
    student(int id,String name,int mark)
    {
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString()
    {
        return id+"-"+name+"-"+mark;
    } 
}
public class comparatorExample {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
        students.add(new student(9,"ff" , 80));
        students.add(new student(4,"kk" , 70));
        students.add(new student(5,"aa" , 90));
        students.add(new student(6,"mm" , 85));
        Comparator<student> byId = new Comparator<student>() {
            public int compare(student a,student b)
            {
                return a.id-b.id;
            }
        };
        Collections.sort(students,byId);
        System.out.println(students);
    }    
}
