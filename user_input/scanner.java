import java.util.Scanner;
public class scanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Name : ");
        String name=sc.nextLine();

        System.out.println("Enter A Password : ");
        String pass=sc.nextLine();

        System.out.println("Name : "+name+"\n"+"Password : "+pass);


    }
}