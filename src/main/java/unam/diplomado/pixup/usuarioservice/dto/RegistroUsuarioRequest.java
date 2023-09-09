package unam.diplomado.pixup.usuarioservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import unam.diplomado.pixup.usuarioservice.domain.Domicilio;
import unam.diplomado.pixup.usuarioservice.domain.Usuario;

@Data
@NoArgsConstructor
public class RegistroUsuarioRequest {
	
	@NotNull
	@Valid
	private Usuario usuario;
	private Domicilio domicilio;
	

}
