import java.util.Scanner;
public class Circle {
    double radiusInMm;

    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }
    double getCircumference(){
        return 2*radiusInMm*Math.PI;
    }
    double getArea(){
        return Math.PI*Math.pow(radiusInMm, 2);
    }
    /* 
    // if you want to use this string builder and get result is Circle@33909752 type
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radiusInMm=").append(radiusInMm);
        sb.append("Circumference in mm =").append(getCircumference());
        sb.append("Area in mm =").append(getArea());
        sb.append("}");
        // TODO Auto-generated method stub
        return super.toString();
    }
        */
        // if you use this string builder then get final output
    public String toString(){
        return "Circle Prop : Radius is mm: "+radiusInMm+", Circumferences in mm: "+getCircumference()+", Area in mm :"+getArea();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wlecome to the world of circle");
        System.out.print("Please Enter the radius of Circle:: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
        
    }
}
