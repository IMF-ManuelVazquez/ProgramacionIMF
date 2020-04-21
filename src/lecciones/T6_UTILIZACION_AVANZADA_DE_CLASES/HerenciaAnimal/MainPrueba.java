package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaAnimal;

public class MainPrueba {

	public static void main(String[] args) {
		
		Tigre tigre = new Tigre("ff", "red", "ff", 4);
		Jirafa jirafa = new Jirafa("dd", "blue", "gg", 3, 4);
		
		tigre.comer();
		tigre.beber();
		tigre.dormir();
		tigre.rugir();
		
		jirafa.comer();
		jirafa.beber();
		jirafa.dormir();
		jirafa.alcanzarCimaArbol();
		

	}

}
