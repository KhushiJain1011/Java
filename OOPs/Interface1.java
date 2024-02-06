//Interface in JAVA

interface area{
    final static float pi = 3.14F;
    float calculate(float x, float y);
}
public class Interface1 {
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        area a;     //object(a) for interface area is created
        a = rect;
        System.out.println("Area of rectangle: "+a.calculate(10, 20));
        a = cir;
        System.out.println("Area of circle: "+a.calculate(10, 0));
    }
}
class Rectangle implements area{
    public float calculate(float x, float y){
        return x*y;
    }
}
class Circle implements area{
    public float calculate(float x, float y){
        return pi*x*x;
    }
}