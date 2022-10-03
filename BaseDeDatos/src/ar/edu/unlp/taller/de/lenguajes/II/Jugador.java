package ar.edu.unlp.taller.de.lenguajes.II;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private int docId;
	private int telefono;
	private String email;
	private Pais pais;

	public Jugador() {

	}

	public Jugador(String nombre, String apellido, int docId, int telefono, String email, Pais pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.docId = docId;
		this.telefono = telefono;
		this.email = email;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Pais getIdPais() {
		return pais;
	}

	public void setIdPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", docId=" + docId + ", telefono=" + telefono
				+ ", email=" + email + ", pais=" + pais + "]";
	}
}
