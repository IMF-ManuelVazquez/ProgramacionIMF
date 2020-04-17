package boletines.boletin3C.bol4_POO_UML.apartado2.ejercicio3;

import java.util.Random;

public class Disco {
	
	private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;

	public Disco() {
		super();
	}

	public Disco(String autor, String titulo, String genero, int duracion) {
		super();
		this.codigo = String.valueOf(new Random().nextInt());
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}

}
