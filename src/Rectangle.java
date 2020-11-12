public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public Rectangle(){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double height) {
        this.length = height;
    }

    public double getSurfaceArea(){
        return getWidth() * getLength();
    }

    public double getPerimeter(){
        return (getWidth() + getLength()) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Name: " + name +
                ", width: " + width +
                ", length: " + length +
                ", perimeter: " + getPerimeter() +
                ", surfaceArea: " + getSurfaceArea() +
                '}' + "\n";
    }
}
