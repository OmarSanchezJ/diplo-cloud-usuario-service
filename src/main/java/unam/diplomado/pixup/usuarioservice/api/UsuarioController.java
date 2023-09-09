package unam.diplomado.pixup.usuarioservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import unam.diplomado.pixup.usuarioservice.domain.Usuario;
import unam.diplomado.pixup.usuarioservice.dto.RegistroUsuarioRequest;
import unam.diplomado.pixup.usuarioservice.service.UsuarioService;

@RestController
public class UsuarioController implements UsuarioApi{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public Usuario registrarUsuario(@NotNull @Valid RegistroUsuarioRequest request) {
		return usuarioService.registrarUsuario(			
				request.getUsuario(), request.getDomicilio());
		
	}


}
