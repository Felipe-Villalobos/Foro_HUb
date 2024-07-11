package forohub.api.domain.topico;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record TopicoDTO(
        @NotNull(message = "El título no se puede repetir.")
        String title,
        @NotNull(message = "Solo se permiten 700 caracteres de longitud.")
        String message,
        @NotNull(message = "Seleccione un estadp ´ACTIVO´ o ´INACTIVO´")
        Status status,
        @NotNull(message = "Utilice su ID de usuario")
        Long usuario_Id,
        @NotNull(message = "Indica la formación que estas cursando.")
        String curso,
        LocalDateTime date
) {
        // Getter methods should be named as per JavaBean conventions
        public Long usuario_Id() {
                return this.usuario_Id;
        }

        public String title() {
                return this.title;
        }

        public String message() {
                return this.message;
        }

        public Status status() {
                return this.status;
        }

        public String curso() {
                return this.curso;
        }

        public LocalDateTime date() {
                return this.date;
        }
}
