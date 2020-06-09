package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.RepasoT6;

public class OrdenadorSobremesa extends Ordenador{

	
	public OrdenadorSobremesa(String cpu, int memoria, double precio) {
		super(cpu, memoria, precio);
	}
	
	@Override
	public double impuestoAñadidos() {
		// TODO Auto-generated method stub
		return 100;
	}
	
}
