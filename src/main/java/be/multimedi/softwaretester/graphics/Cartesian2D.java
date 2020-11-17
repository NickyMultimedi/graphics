package be.multimedi.softwaretester.graphics;

public class Cartesian2D implements Coordinates {
    //FIELDS
    private int x;
    private int y;

    //CONSTRUCTORS
    public Cartesian2D() {
        this(0,0);
    }
    public Cartesian2D(int x, int y) {
        setCoordinates(x, y);
    }

    //GETTERS
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int[] getCoordinates() {
        return new int[]{x, y};
    }

    //SETTERS
    private void setX(int x) {
        this.x = x;
    }
    private void setY(int y) {
        this.y = y;
    }
    public void setCoordinates(int x, int y) {
        checkIfCoordinatesArePositiveElseThrowException();
        setX(x);
        setY(y);
    }

    //METHODS
    void checkIfCoordinatesArePositiveElseThrowException() {
        if (!coordinatesArePositive()) {
            throw new NegativeCoordinatesException();
        }
    }

    boolean coordinatesArePositive() {
        return xIsPositive() && yIsPositive();
    }

    boolean xIsPositive() {
        return x > 0;
    }

    boolean yIsPositive() {
        return y > 0;
    }

    public void moveOverXAxis(int movedOverX) {
        int newXPosition = getX() + movedOverX;
        setX(newXPosition);

        if (!xIsPositive()) {
            setX(0);
        }

    }
    public void moveOverYAxis(int movedOverY) {
        int newYPosition = getY() + movedOverY;
        setY(newYPosition);

        if (!yIsPositive()) {
            setY(0);
        }
    }
    public void move(int movedOverX, int movedOverY) {
        moveOverXAxis(movedOverX);
        moveOverYAxis(movedOverY);
    }
}
