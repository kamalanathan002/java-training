public class sam2
{
    public static void main(String[] args) {
       String s="Mr Ding";
       String[] words=s.split(" ");
       for(String word:words)
       {
        int len=word.length();
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(word.charAt(i));
        }
        System.out.printf(" ");
       }
    }
}