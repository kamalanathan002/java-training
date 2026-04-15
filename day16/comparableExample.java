import java.util.ArrayList;
import java.util.Comparator;
class student implements Comparable<student>
{
    String name;
    int mark;
    student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(student s)
    {
        return this.mark-s.mark;
    }
}
public class comparableExample {
    public static void main(String[] args) {
        ArrayList<student> s = new ArrayList<>();
        
    }
}
