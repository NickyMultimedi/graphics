package be.multimedi.softwaretester.graphics;

public class NegativeCoordinatesException extends RuntimeException {
    public NegativeCoordinatesException() {
        super("Coordinates can't be negative");
    }

    public NegativeCoordinatesException(String message) {
        super(message);
    }

    public NegativeCoordinatesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeCoordinatesException(Throwable cause) {
        super(cause);
    }
}
