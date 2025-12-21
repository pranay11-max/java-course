
public class building{
    String name;
    int floors;
    String colors;


    building(String name, int floors, String colors){
        this.name = name;
        this.floors = floors;
        this.colors = colors;
    }

    void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Floors : "+floors);
        System.out.println("Colors : "+colors);
    }
    public static void main(String[] args) {
        building b1 ;
        b1 = new building("Marathon",1001,"Red");

        building b2;
        b2 = new building("SRS",1049,"Green");

        b1.printDetails();
        b2.printDetails();
    }
}