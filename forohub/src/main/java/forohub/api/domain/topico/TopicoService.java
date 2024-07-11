package forohub.api.domain.topico;

import forohub.api.domain.usuario.Usuario;
import forohub.api.domain.usuario.UsuarioRepository;
import forohub.api.infra.errors.VerificadorDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public RespuestaTopicoDTO topicoCreado(TopicoDTO topicoDTO) {
        Long usuarioId = topicoDTO.usuario_Id();
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new VerificadorDeIntegridad("Este ID de usuario no está registrado en la base de datos."));

        String title = topicoDTO.title();
        if (title != null && topicoRepository.existsByTitleIgnoreCase(title)) {
            throw new VerificadorDeIntegridad("Este título ya está presente en la base de datos. Por favor revise el tópico existente.");
        }

        String message = topicoDTO.message();
        if (message != null && topicoRepository.existsByMessageIgnoreCase(message)) {
            throw new VerificadorDeIntegridad("Este mensaje ya está presente en la base de datos. Por favor revise el tópico existente.");
        }

        Topico topico = new Topico(
                null,
                title,
                message,
                topicoDTO.date(),
                topicoDTO.status(),
                usuario,
                topicoDTO.curso()
        );

        Topico savedTopico = topicoRepository.save(topico);
        return new RespuestaTopicoDTO(savedTopico);
    }
}
