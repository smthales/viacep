package excecoes;

public class EntradaErradaException extends RuntimeException {

    private String message;

    public EntradaErradaException(String message) {
        this.message = message;
    }

    public String toString() {
        return this.message;
    }


}
