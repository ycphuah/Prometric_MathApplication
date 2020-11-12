public class Triangle extends Shape {
    double height;
    double base;
    double a;
    double b;

    public Triangle(String name, double height, double base, double a, double b) {
        super(name);
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
    }

    public Triangle(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getSurfaceArea(){
        return (getHeight() * getBase()) / 2;
    }

    public double getPerimeter(){
        return a + b + getBase();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Name: " + name + ", " +
                "height: " + height +
                ", base: " + base +
                ", perimeter: " + getPerimeter() +
                ", surfaceArea: " + getSurfaceArea() +
                '}' + "\n";
    }
}
