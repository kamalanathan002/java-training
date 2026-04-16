import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TopKElements {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWrtier");
            writer.write("Kamalanathan");
            writer.close();
        }
        catch(IOException e)
        {

        }
    }
}
