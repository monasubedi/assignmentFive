package Prog2;

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(String color,double width,double height){
        super(color);
        this.width = width;
        this.height = height;

    }

    @Override
    public double calculateArea(){
        double area = width * height;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * width + 2 * height;
        return perimeter;
    }

}
