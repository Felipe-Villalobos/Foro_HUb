package forohub.api.domain.respuesta;

import forohub.api.domain.topico.TopicoRepository;
import forohub.api.domain.usuario.UsuarioRepository;
import forohub.api.infra.errors.VerificadorDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaService {
    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RespuestaRepository repository;

    public RespuestaCreadaDTO respuestaCreadaDTO(RespuestaDTO respuestaDTO) {
        if (!usuarioRepository.findById(respuestaDTO.usuario_Id()).isPresent()){
            throw new VerificadorDeIntegridad("Este ID de usuario no está registrado en la base de datos. ");
        }
        if (!topicoRepository.findById(respuestaDTO.topico_Id()).isPresent()){
            throw new VerificadorDeIntegridad("Este id de tópico no está registrado en la base de datos. ");
        }
        var usuario = usuarioRepository.findById(respuestaDTO.usuario_Id()).get();
        var topico =topicoRepository.findById(respuestaDTO.topico_Id()).get();

        var rVerified= new Respuesta(null,respuestaDTO.solution(),usuario,topico,respuestaDTO.creationDate());
        repository.save(rVerified);
        return new RespuestaCreadaDTO(rVerified);
    }

}