import java.util.Scanner;

public class problem{
    String name;
    private String pass;

    public String getPass(){
        return pass;
    }

    public void setPass(String pass){
        this.pass=pass;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        problem p=new problem();
        
        System.out.println("Enter a Name : ");
        p.name=sc.nextLine();

        System.out.println("Enter a Password : ");
        String passw=sc.nextLine();
        p.setPass(passw);

        System.out.println("Name : "+p.name);
        System.out.println("Password : "+p.getPass());

    }
}