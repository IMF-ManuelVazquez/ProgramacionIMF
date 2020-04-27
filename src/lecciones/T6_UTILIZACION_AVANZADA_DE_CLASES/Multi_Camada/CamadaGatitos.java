package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Multi_Camada;

public class CamadaGatitos {

	Gato[] arrCamada = new Gato[4];
	
	public CamadaGatitos(Gato gato1, Gato gato2, Gato gato3, Gato gato4) {
		arrCamada[0]=gato1;
		arrCamada[1]=gato2;
		arrCamada[2]=gato2;
		arrCamada[3]=gato4;
	}
	
	public void dameNombre(int pos) {
		System.out.println(arrCamada[pos].getNombreGato());
	}
	
}

