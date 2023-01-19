public class Circle {
    private final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    public void area(){
        System.out.println(PI*(radius*radius));
    }
    public void circumference(){
        System.out.println(PI*(2*radius));
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
