package unam.diplomado.pixup.usuarioservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Domicilio {

	@NotBlank(message="No puede dejar el campo en blanco")
	private String calle;
	@NotBlank(message="Numero exterior no puede estar blanco")
	@Size(min=3, max=30, message="Número exterior debe contener entre {min} y {max}")
	private String numExterior;
	private String numInterior;
	
}
