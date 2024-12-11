package theory.exeption;

public class DogIsNotReadyException extends Exception {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
