package exception;

public class OwnerAlreadyExistsException extends RuntimeException{

    public OwnerAlreadyExistsException(String message) {
        super(message);
    }
}
