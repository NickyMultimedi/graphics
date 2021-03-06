package be.multimedi.softwaretester.graphics;

public class Square extends Rectangle {
    // FIELDS

    //CONSTRUCTORS
    public Square() {
        this(4);
    }
    public Square(double side) {
        this(new Cartesian2D(0,0), side);
    }
    public Square(Cartesian2D coordinates, double side) {
        super(coordinates, side, side);
    }
    public Square(Square square) {
        super(square);
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
