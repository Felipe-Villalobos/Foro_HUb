package forohub.api.infra.errors;

public class VerificadorDeIntegridad extends RuntimeException {
    public VerificadorDeIntegridad(String s) {

        super(s);
    }
}