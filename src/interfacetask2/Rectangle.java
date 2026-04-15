package interfacetask2;

public class Rectangle extends Shape implements Drawable{

    double width;
    double height;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    public void draw(){
        System.out.println("Drawing interfacetask2.Rectangle");
    }
}
