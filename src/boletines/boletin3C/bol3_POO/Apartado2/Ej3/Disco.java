package boletines.boletin3C.bol3_POO.Apartado2.Ej3;

import java.util.Random;

public class Disco {

	private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;
	
	// String >>> Integer >>> Integer.parseInt(String)
	// Integer >> String  >>> String.valueOf(int)
	// 2344455555   4213213
	
	public Disco(String autor, String titulo, String genero, int duracion) {
		//this.codigo = Integer.toString(Math.abs(new Random().nextInt()));  // String vs int
		this.codigo = String.valueOf(Math.abs(new Random().nextInt()));  // String vs int
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
		return this.codigo;
	}

	@Override
	public String toString() {
		return "MiDisco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	
}
