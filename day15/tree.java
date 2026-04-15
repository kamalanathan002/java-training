import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        int[] num={3,2,1,4,5,7,9,8};
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i:num)
        {
            tree.add(i);
        }
        System.out.println(tree);
    }
}
