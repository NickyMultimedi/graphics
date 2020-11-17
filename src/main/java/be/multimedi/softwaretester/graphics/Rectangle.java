package be.multimedi.softwaretester.graphics;

public class Rectangle {
    //FIELDS
    public static final int CORNERS = 4;
    public static final String DESCRIPTION = "I am a Rectangle";

    private Cartesian2D coordinates;
    private double height;
    private double width;

    //CONSTRUCTORS
    public Rectangle() {
        this(4.2, 5);
    }
    public Rectangle(double height, double width) {
        this(new Cartesian2D(0, 0), height, width);
    }
    public Rectangle(Cartesian2D coordinates, double height, double width) {
        setCoordinates(coordinates);
        this.setHeight(height);
        this.setWidth(width);
    }
    public Rectangle(Rectangle rect) {
        this(
                rect.getCoordinates(),
                rect.getHeight(),
                rect.getWidth()
        );
    }

    //GETTERS
    public Cartesian2D getCoordinates() {
        return coordinates;
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
    public void setCoordinates(Cartesian2D coordinates) {
        this.coordinates = coordinates;
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
    private void checkIfZeroThrowException(double number) {
        if (number == 0) {
            throw new RuntimeException("Dimensions can't be zero");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("coordinates=").append(coordinates);
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

        if (Double.compare(rectangle.getHeight(), getHeight()) != 0) return false;
        if (Double.compare(rectangle.getWidth(), getWidth()) != 0) return false;
        return getCoordinates() != null ? getCoordinates().equals(rectangle.getCoordinates()) : rectangle.getCoordinates() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getCoordinates() != null ? getCoordinates().hashCode() : 0;
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
