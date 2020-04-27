package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Multi_Camada;

public class MainGato {

	public static void main(String[] args) {

		Gato gato1 = new Gato("Garfield");
		Gato gato2 = new Gato("Alfie");
		Gato gato3 = new Gato("Mica");
		Gato gato4 = new Gato("Micu");
		
		CamadaGatitos camadaGatos = new CamadaGatitos(gato1, gato2, gato3, gato4);
		
		camadaGatos.dameNombre(2);
		
		System.out.println(gato1);

	}

}
