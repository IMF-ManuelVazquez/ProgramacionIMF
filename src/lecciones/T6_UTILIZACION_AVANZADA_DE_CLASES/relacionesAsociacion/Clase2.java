package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.relacionesAsociacion;

public class Clase2 {
	
	private String atributoStringC2;
	private int atributoIntC2;
	
	public Clase2(String atributoStringC2, int atributoIntC2) {
		super();
		this.atributoStringC2 = atributoStringC2;
		this.atributoIntC2 = atributoIntC2;
	}
	public String getAtributoStringC2() {
		return atributoStringC2;
	}
	public void setAtributoStringC2(String atributoStringC2) {
		this.atributoStringC2 = atributoStringC2;
	}
	public int getAtributoIntC2() {
		return atributoIntC2;
	}
	public void setAtributoIntC2(int atributoIntC2) {
		this.atributoIntC2 = atributoIntC2;
	}
	@Override
	public String toString() {
		return "Clase2 [atributoStringC2=" + atributoStringC2 + ", atributoIntC2=" + atributoIntC2 + "]";
	}
	
	

}
