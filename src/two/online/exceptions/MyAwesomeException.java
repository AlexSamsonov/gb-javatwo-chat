package two.online.exceptions;

public class MyAwesomeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Awesome thing happened!";
    }
}
