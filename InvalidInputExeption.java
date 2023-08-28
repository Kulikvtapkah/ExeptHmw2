package ExeptHmw2;

public class InvalidInputExeption extends RuntimeException {
    String message;

    public InvalidInputExeption(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return String.format("\nНевозможная операция: %s", message);
    }

}
