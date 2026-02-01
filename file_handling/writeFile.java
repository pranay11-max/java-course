import java.io.FileWriter;
import java.io.IOException;

public class writeFile{
    public static void main(String[] args) {
        try {
            FileWriter myWriter=new FileWriter("p.txt");
            myWriter.write("My Name is Pranay");
            myWriter.close();
            System.out.println("Successfully Wrote to the File");
        } catch (IOException e) {
            System.out.println("Error");
        }
        

    }
}