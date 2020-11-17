package be.multimedi.softwaretester.graphics;

public class MainApp {
    public static void main(String[] args) {
        Square s = new Square();
        Cartesian2D cart = s.getCoordinates();
        cart.setCoordinates(4,7);
        System.out.println(cart.toString());
        System.out.println(s);
    }
}
