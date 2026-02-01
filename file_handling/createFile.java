import java.io.File;
import java.io.IOException;
public class createFile{
    public static void main(String[] args) {
        try {
            File myobj=new File("p.txt");
            if(myobj.createNewFile()){
                System.out.println("File Created"+myobj.getName());
            }
            else{
                System.out.println("File is already created");
            }
            
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
    }
}