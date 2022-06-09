package nl.inholland.exam.movies._672395timroffelsen.exception;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException() {
        super("You are not authorized to make this request.");
    }
    public ForbiddenException(String msg) {
        super(msg);
    }

}
