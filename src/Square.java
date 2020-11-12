public class Square extends Shape {

    double length;

    public Square(String name, double width) {
        super(name);
        this.length = width;
    }

    public Square(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    public double getSurfaceArea(){
        return getLength() * getLength();
    }

    public double getPerimeter(){
        return (getLength() + getLength()) * 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Name: " + name +
                ", Length: " + length +
                ", perimeter: " + getPerimeter() +
                ", surfaceArea: " + getSurfaceArea() +
                '}' + "\n";
    }
}
