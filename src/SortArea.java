import java.util.Comparator;

public class SortArea implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getSurfaceArea(), o2.getSurfaceArea());
    }
}
