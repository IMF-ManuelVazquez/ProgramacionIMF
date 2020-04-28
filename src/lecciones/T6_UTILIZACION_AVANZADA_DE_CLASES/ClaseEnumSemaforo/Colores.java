package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseEnumSemaforo;

public enum Colores { 
	RED(10,100),     // 0 
	YELLOW(20,200),  // 1
	GREEN(30,300),   // 2
	BLACK(40,400),   // 3
	PINK(50,500);     // 4 
	
	private int datoOut;
	private int dataOut2;

	private Colores(int datoOut, int dataOut2) {
		this.datoOut = datoOut;
		this.dataOut2 = dataOut2;
	}

	public int getDatoOut() {
		return datoOut;
	}
	
	public int getDatoOut2() {
		return dataOut2;
	}
	
}