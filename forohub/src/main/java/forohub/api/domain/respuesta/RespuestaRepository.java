package forohub.api.domain.respuesta;

import forohub.api.domain.topico.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    Page<Respuesta> findByActiveTrue(Pageable paged);
}