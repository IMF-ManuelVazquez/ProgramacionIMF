package boletines.boletin5.ej10;

public interface InterfacePila {

	public void inicializarPila();
	
	public int longitudPila();
	
	public boolean estaLlenaPila();

	public void addPila(String inStr) ;
	
	public String sacarDeLaPila();
	
	public void mostrarPila();
	
}
