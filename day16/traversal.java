import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

class traversal
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext())
        {
            int current = it.next();
            if(current==4)
            {
                it.remove();
            }
            System.out.println(current);
        }
        while(it.hasPrevious())
        {
            int prev=it.previous();
            System.out.println(prev);
        }
        System.out.println(list);
    }
}