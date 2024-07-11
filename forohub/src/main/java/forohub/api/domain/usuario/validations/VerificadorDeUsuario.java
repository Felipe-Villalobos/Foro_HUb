package forohub.api.domain.usuario.validations;

import forohub.api.domain.usuario.RegistroUsuarioDTO;

public interface VerificadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}