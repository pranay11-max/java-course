class senior{
    String name="Ram";
    int age=36;
}
class junior extends senior{
    String educationLevel="BSCIT";
}

class youngster extends junior{
    String hobby="Coding";

    public static void main(String[] args) {
        youngster y=new youngster();

        System.out.println("Senior Name : "+y.name);
        System.out.println("Senior Age : "+y.age);

        System.out.println("Junior Education Level : "+y.educationLevel);
        System.out.println("Youngster Hobby is : "+y.hobby);
    }
}

