package Prog2;

public class Circle extends Shape {
    double radius;

    Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        double area = Math.PI * radius;

        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;

        return perimeter;
    }
}
