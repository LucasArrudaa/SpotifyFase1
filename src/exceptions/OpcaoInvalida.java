package exceptions;

public class OpcaoInvalida extends RuntimeException {
    public OpcaoInvalida(String message) {
        super(message);
    }
}
