package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Interfaz;

public interface InterfacePila {

	public void inicializarPila();
	
	public int longitudPila();
	
	public boolean estaLlenaPila();

	public void addPila(String inStr) ;
	
	public String sacarDeLaPila();
	
	public void mostrarPila();
	
}
