class Vehical{
    String model="NS200";
}

class bike extends Vehical{
    public static void main(String[] args) {
        bike b= new bike();

        System.out.println("Bike Name is : "+b.model);
    }
}