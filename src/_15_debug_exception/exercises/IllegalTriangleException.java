package _15_debug_exception.exercises;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error input length of triangle's edge: " + super.getMessage();
    }
}
