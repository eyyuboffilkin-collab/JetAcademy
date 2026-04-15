package interfacetask2;

public class Circle extends Shape implements Drawable{
    double radius;

     Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

   public void draw(){
        System.out.println("Drawing interfacetask2.Circle");

    }
}
