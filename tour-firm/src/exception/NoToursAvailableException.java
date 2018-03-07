package exception;

public class NoToursAvailableException extends Exception {
    public NoToursAvailableException(String message) {
        super( message );
    }

    public NoToursAvailableException(String message, Throwable cause) {
        super( message, cause );
    }

    public NoToursAvailableException(Throwable cause) {
        super( cause );
    }

    protected NoToursAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
