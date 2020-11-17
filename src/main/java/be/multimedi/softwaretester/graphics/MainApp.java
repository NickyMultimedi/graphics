package be.multimedi.softwaretester.graphics;

public class MainApp {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Square square2 = new Square(7);
        System.out.println(square2);
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());
        square2.setSide(3);

        Rectangle rect = new Square(4);
        System.out.println(rect);
        rect.setHeight(7);
        System.out.println(rect);
        rect.setSide();
    }
}
