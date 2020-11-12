import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.GsonBuilder;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle("C1", 5));
        shapes.add(new Triangle("T2", 5, 3, 4, 6));
        shapes.add(new Square("S3", 5));
        shapes.add(new Rectangle("R4", 5, 10));

        menu(shapes);

    }

    public static void menu(ArrayList<Shape> shapes){

        Scanner kb = new Scanner(System.in);
        System.out.println("****Shape Application****");
        System.out.println("1. Print All Shapes");
        System.out.println("2. Sort By Surface Area");
        System.out.println("3. Sort By Perimeter");
        System.out.println("4. Add Circle");
        System.out.println("5. Add Triangle");
        System.out.println("6. Add Square");
        System.out.println("7. Add Rectangle");
        System.out.println("8. Remove By Name");
        System.out.println("9. Print to JSON file");
        System.out.println("10. Exit");
        int choice;
        System.out.print("\n" +" Enter a number: ");
        choice = kb.nextInt();

        switch(choice){
            case 1: printAllShapes(shapes);
            break;
            case 2: sortByPerimeter(shapes);
            break;
            case 3: sortByArea(shapes);
            break;
            case 4: addCircle(shapes);
            break;
            case 5: addTriangle(shapes);
            break;
            case 6: addSquare(shapes);
            break;
            case 7: addRectangle(shapes);
            break;
            case 8: removeByName(shapes);
                break;
            case 9:
                System.out.println("Print to JSON....");
                writeToJson(shapes);
                break;
            case 10:
                break;
            default:
                System.out.println("Please enter a valid choice!");
                menu(shapes);
        }


    }

    public static void initialiseExamples(){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle("C1", 5));
        shapes.add(new Triangle("T2", 5, 3, 4, 6));
        shapes.add(new Square("S3", 5));
        shapes.add(new Rectangle("R4", 5, 10));

        printAllShapes(shapes);


    }

    public static void printAllShapes(ArrayList<Shape> shapes){
        System.out.println();
        for(int i = 0; i < shapes.size(); i++){
            System.out.println(shapes.get(i));

        }
        menu(shapes);
    }

    public static void sortByArea(ArrayList<Shape> shapes){
        shapes.sort(new SortArea());
        printAllShapes(shapes);
        menu(shapes);
    }

    public static void sortByPerimeter(ArrayList<Shape> shapes){
        shapes.sort(new SortPerimeter());
        printAllShapes(shapes);
        menu(shapes);
    }

    public static void addCircle(ArrayList<Shape> shapes){
        Scanner kb = new Scanner(System.in);
        System.out.print("Insert Circle Name: ");
        String name = kb.next();
        System.out.print("Insert Circle Radius: ");
        double radius = kb.nextDouble();
        shapes.add(new Circle(name, radius));

        printAllShapes(shapes);
        menu(shapes);
    }


    public static void addTriangle(ArrayList<Shape> shapes){
        Scanner kb = new Scanner(System.in);
        System.out.print("Insert Triangle Name: ");
        String name = kb.next();
        System.out.print("Insert Triangle Height: ");
        double height = kb.nextDouble();
        System.out.print("Insert Triangle Base: ");
        double base = kb.nextDouble();
        System.out.print("Insert Triangle Length A: ");
        double a = kb.nextDouble();
        System.out.print("Insert Triangle Length B: ");
        double b = kb.nextDouble();
        shapes.add(new Triangle(name, height, base, a, b));

        printAllShapes(shapes);
        menu(shapes);
    }

    public static void addSquare(ArrayList<Shape> shapes){
        Scanner kb = new Scanner(System.in);
        System.out.print("Insert Square Name: ");
        String name = kb.next();
        System.out.print("Insert Square Length: ");
        double length = kb.nextDouble();
        shapes.add(new Square(name, length));

        printAllShapes(shapes);
        menu(shapes);
    }

    public static void addRectangle(ArrayList<Shape> shapes){
        Scanner kb = new Scanner(System.in);
        System.out.print("Insert Rectangle Name: ");
        String name = kb.next();
        System.out.print("Insert Rectangle Length: ");
        double length = kb.nextDouble();
        System.out.print("Insert Rectangle Height: ");
        double height = kb.nextDouble();

        if(length == height){
            System.out.println("Length and height of rectangle must not be the same!");
            addRectangle(shapes);
        }
        else{
            shapes.add(new Rectangle(name, length, height));
        }


        printAllShapes(shapes);
        menu(shapes);
    }

    public static void removeByName(ArrayList<Shape> shapes){
        Scanner kb = new Scanner(System.in);
        System.out.print("Insert Shape Name to remove: ");
        String name = kb.next();
        Iterator<Shape> iter = shapes.iterator();
        while(iter.hasNext()){
            Shape s = iter.next();
            if(s.getName().equals(name)){
                iter.remove();
            }
        }

        printAllShapes(shapes);
        menu(shapes);
    }

    public static void writeToJson(ArrayList<Shape> shapes){
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        try(FileWriter writer = new FileWriter("Shape.json")){
            gson.toJson(shapes.toString(), writer);
        } catch (IOException e){
            e.printStackTrace();
        }

        menu(shapes);
    }


}
