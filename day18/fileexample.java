import java.io.File;
import java.io.IOException;
class fileexample
{
    public static void main(String[] args)throws IOException {
        File newFile = new File("test.txt");
        if(newFile.createNewFile())
        {
            System.out.println("File Created: "+newFile.getName());
        }
        else
        {
            System.out.println("Not able to crate file");
        }
    }
}