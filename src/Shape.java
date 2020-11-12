public class Shape {
    String name;
    double perimeter;
    double surfaceArea;

    public Shape(String name, double perimeter, double surfaceArea){
        this.name = name;
        this.perimeter = perimeter;
        this.surfaceArea = surfaceArea;
    }

    public Shape(String name, double perimeter) {
        this.name = name;
        this.perimeter = perimeter;
    }

    public Shape(){

    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name: '" + name + '\'' +
                ", perimeter: " + perimeter +
                ", surfaceArea: " + surfaceArea +
                '}' ;
    }


}

