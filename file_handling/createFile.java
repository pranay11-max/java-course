import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class createFile{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter File Name : ");
        String fileName=sc.nextLine();

        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }
        
        try {
            File myobj=new File(fileName);
            if(myobj.createNewFile()){
                System.out.println("File Created : "+myobj.getName());
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