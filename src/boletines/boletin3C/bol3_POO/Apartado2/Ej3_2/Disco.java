package boletines.boletin3C.bol3_POO.Apartado2.Ej3_2;

import java.util.Random;

public class Disco {
	
	private String codigo;
	private String autor;
	private String tituo;
	private String genero;
	private int duracion;
	
	public Disco(String autor, String tituo, String genero, int duracion) {
		this.codigo = String.valueOf(Math.abs(new Random().nextInt()));
		this.autor = autor;
		this.tituo = tituo;
		this.genero = genero;
		this.duracion = duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTituo() {
		return tituo;
	}

	public void setTituo(String tituo) {
		this.tituo = tituo;
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

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", tituo=" + tituo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	

}
