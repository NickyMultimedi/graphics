package be.multimedi.softwaretester.graphics;

public class Square extends Rectangle {
    // FIELDS

    //CONSTRUCTORS
    public Square() {

    }
    public Square(double side) {

    }
    public Square(int x, int y, double side) {
        super(x, y, side, side);
    }
    public Square(Square square) {

    }
    //GETTERS
    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }
    @Override
    public void setHeight(double height) {
        this.setSide(height);
    }
    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }
    //SETTERS

    //METHODS
}
