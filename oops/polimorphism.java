public class polimorphism{
    static void area(int side){
        System.out.println("Area of square is : "+side*side);
    }

    static void area(Double base, Double height){
        System.out.println("Area of Triangle is : "+0.5*base*height);
    }

    static void area(Double length, Double breadth, Double height){
        System.out.println("Area of Rectangle is : "+ length*breadth*height);
    }

    static void area(Double a, Double b, Double c, Double d){
        Double area1=4 * c * c - (a - b) * (a - b);
        System.out.println("Area of Trapezium is : "+area1);
    }

    public static void main(String[] args) {
        area(2);
        area(2.5,3.6);
        area(1.2,2.5,3.4);
        area(2.2,5.3,1.2,3.1);
    }

    


}