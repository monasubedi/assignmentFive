package Prog2;

public class Main {
    public static void main(String[]args){

        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("green",12.2,12.5);
        shapes[1] = new Rectangle("blue",13.2,13.3);
        shapes[2] = new Rectangle("orange",15.0,16.0);
        shapes[3] = new Circle("black",5.0);
        shapes[4] = new Square("pink",5.0);

        printTotal(shapes);

    }

    public static void printTotal(Shape[]shapes){
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for(Shape s : shapes){
           totalArea += s.calculateArea();
           totalPerimeter += s.calculatePerimeter();
        }

        System.out.println("Total area is " + totalArea + "\nTotal perimeter is " + totalPerimeter);
    }
}
