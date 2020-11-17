package be.multimedi.softwaretester.graphics;

public class Rectangle {
    //FIELDS
    public static final int CORNERS = 4;
    public static final String DESCRIPTION = "I am a Rectangle";

    private int x;
    private int y;
    private double height;
    private double width;

    //CONSTRUCTORS
    public Rectangle() {
        this(4.2, 5);
    }
    public Rectangle(double height, double width) {
        this(0, 0, height, width);
    }
    public Rectangle(int x, int y, double height, double width) {
        this.setX(x);
        this.setY(y);
        this.setHeight(height);
        this.setWidth(width);
    }
    public Rectangle(Rectangle rect) {
        this(
                rect.getX(),
                rect.getY(),
                rect.getHeight(),
                rect.getWidth()
        );
    }

    //GETTERS
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getPerimeter() {
        return this.height * 2 + this.width * 2;
    }
    public double getArea() {
        return this.height * this.width;
    }

    //SETTERS
    public void setX(int x) {
        checkIfNegativeThrowException(x);
        this.x = x;
    }
    public void setY(int y) {
        checkIfNegativeThrowException(y);
        this.y = y;
    }
    public void setHeight(double height) {
        checkIfZeroThrowException(height);
        this.height = Math.abs(height);
    }
    public void setWidth(double width) {
        checkIfZeroThrowException(width);
        this.width = Math.abs(width);
    }

    //METHODS
    private void checkIfNegativeThrowException(int number) {
        if (number < 0) {
            throw new RuntimeException("Position should be positive");
        }
    }

    private void checkIfZeroThrowException(double number) {
        if (number == 0) {
            throw new RuntimeException("Dimensions can't be zero");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getX() != rectangle.getX()) return false;
        if (getY() != rectangle.getY()) return false;
        if (Double.compare(rectangle.getHeight(), getHeight()) != 0) return false;
        return Double.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getX();
        result = 31 * result + getY();
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
