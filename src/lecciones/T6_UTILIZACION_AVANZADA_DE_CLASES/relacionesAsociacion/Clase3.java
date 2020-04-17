package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.relacionesAsociacion;

public class Clase3 {

	private String atributoStringC3;
	private int atributoIntC3;
	
	public Clase3(String atributoStringC3, int atributoIntC3) {
		super();
		this.atributoStringC3 = atributoStringC3;
		this.atributoIntC3 = atributoIntC3;
	}

	public String getAtributoStringC3() {
		return atributoStringC3;
	}

	public void setAtributoStringC3(String atributoStringC3) {
		this.atributoStringC3 = atributoStringC3;
	}

	public int getAtributoIntC3() {
		return atributoIntC3;
	}

	public void setAtributoIntC3(int atributoIntC3) {
		this.atributoIntC3 = atributoIntC3;
	}

	@Override
	public String toString() {
		return "Clase3 [atributoStringC3=" + atributoStringC3 + ", atributoIntC3=" + atributoIntC3 + "]";
	}
	
	
	
	
	
}
