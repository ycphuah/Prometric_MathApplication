public class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea(){
        return 3.14 * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return Math.round(2 * 3.14 * getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Name: " + name +
                ", radius: " + radius +
                ", perimeter: " + getPerimeter() +
                ", surfaceArea: " + getSurfaceArea() +
                '}' + "\n";
    }




}
