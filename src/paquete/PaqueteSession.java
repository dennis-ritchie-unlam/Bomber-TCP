package paquete;

public class PaqueteSession extends Paquete {
	
	private String usuario;
	private String contrase�a;
	private boolean esValido;

	public PaqueteSession(String usuario, String contrase�a) {
		this.contrase�a = contrase�a;
		this.usuario = usuario;
		this.esValido = false;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}	
	
	public boolean esValido() {
		return esValido;
	}

	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

}
