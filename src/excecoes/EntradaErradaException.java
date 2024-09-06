package excecoes;

public class EntradaErradaException extends RuntimeException {
    private String message;

    public EntradaErradaException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
