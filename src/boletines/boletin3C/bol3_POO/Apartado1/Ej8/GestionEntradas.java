package boletines.boletin3C.bol3_POO.Apartado1.Ej8;

public class GestionEntradas {

	private int numEntradas;

	public GestionEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}
	
	public void vender(int n) {
		if (this.numEntradas>=n) {
			System.out.println("Hay suficientes entradas. Operacion realizada");
			this.numEntradas=this.numEntradas-n;
			System.out.println("Restantes: "+this.numEntradas);
			
		}else {
			System.out.println("No hay suficientes entradas. Operaciones candelada.");
		}
	}

	public int getNumEntradas() {
		return numEntradas;
	}

}
