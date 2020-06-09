package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.RepasoT6;

public class Servidor extends Ordenador{
	
	private double precioMinuto;
	
	public Servidor(String cpu, int memoria, double precio) {
		super(cpu, memoria, precio);
	}

	@Override
	public double impuestoAñadidos() {
		return 20;
	}

}
