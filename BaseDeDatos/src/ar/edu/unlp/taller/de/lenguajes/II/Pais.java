package ar.edu.unlp.taller.de.lenguajes.II;

public class Pais {
	
	private String nombre;
	private Lenguas idioma;

	public Pais() {

	}

	public Pais(String nombre, Lenguas idioma) {
		this.nombre = nombre;
		this.idioma = idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Lenguas getIdioma() {
		return idioma;
	}

	public void setIdioma(Lenguas idioma) {
		this.idioma = idioma;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", idioma=" + idioma + "]";
	}
	
}
