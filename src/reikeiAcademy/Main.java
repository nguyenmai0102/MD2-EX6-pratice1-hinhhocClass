package reikeiAcademy;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Main {
    public static void main(String[] args) {
        // kiem thu class Shape
        System.out.printf("*******shape***********");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

       // kiem thu Class Circle
        System.out.println("------CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

       circle = new Circle("indigo", false, 3.5 );
        System.out.println(circle);
// kiemm thu Rectangle
        System.out.println("-------RECTANGLE------------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);


    }
}
