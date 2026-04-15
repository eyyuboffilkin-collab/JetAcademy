package interfacetask2;

public class Main {
    static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4,6)
        };

        for(Shape s : shapes){
            System.out.println(s.calculateArea());
            ((Drawable)s).draw();
        }
    }
}
