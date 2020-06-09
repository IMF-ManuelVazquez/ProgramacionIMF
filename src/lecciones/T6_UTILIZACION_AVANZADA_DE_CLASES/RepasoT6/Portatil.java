package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.RepasoT6;

public class Portatil extends Ordenador{

	public Portatil(String cpu, int memoria, double precio) {
		super(cpu, memoria, precio);
	}
	
	@Override
	public double impuestoAñadidos() {
		// TODO Auto-generated method stub
		return 60;
	}
	
}
