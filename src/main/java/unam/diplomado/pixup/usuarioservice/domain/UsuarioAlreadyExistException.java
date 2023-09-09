package unam.diplomado.pixup.usuarioservice.domain;

public class UsuarioAlreadyExistException extends RuntimeException  {
	
	public UsuarioAlreadyExistException(String email) {
	super("Ya existe un usuario registrado con email:" + email);
	
	}
}
