package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.relacionesAsociacion;

public class Clase1 {
	
	private String atributoString;
	private int atributoInt; 
//	private Clase2 objetoClase2 = new Clase2("ggg", 33);
	private Clase3 objetoClase3;
	
	public Clase1(String atributoString, int atributoInt) {
		super();
		this.atributoString = atributoString;
		this.atributoInt = atributoInt;
	}
	
	public Clase1(String atributoString, int atributoInt, Clase3 objetoClase3) {
		super();
		this.atributoString = atributoString;
		this.atributoInt = atributoInt;
		this.objetoClase3 = objetoClase3;
		
		Math.abs(222);
	}

	public Clase3 getObjetoClase3() {
		return objetoClase3;
	}
	public void setObjetoClase3(Clase3 objetoClase3) {
		this.objetoClase3 = objetoClase3;
	}
	
	public String getAtributoString() {
		return atributoString;
	}

	public void setAtributoString(String atributoString) {
		this.atributoString = atributoString;
	}

	public int getAtributoInt() {
		return atributoInt;
	}

	public void setAtributoInt(int atributoInt) {
		this.atributoInt = atributoInt;
	}

	@Override
	public String toString() {
		return "Clase1 [atributoString=" + atributoString + ", atributoInt=" + atributoInt + "]";
	}
	
	

}
