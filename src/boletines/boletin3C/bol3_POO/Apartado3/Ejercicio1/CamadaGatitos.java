package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class CamadaGatitos {

	Gato[] camada = new Gato[4];
	
	public CamadaGatitos(Gato gato1, Gato gato2, Gato gato3, Gato gato4) {
		camada[0]=gato1;
		camada[1]=gato2;
		camada[2]=gato2;
		camada[3]=gato4;
	}
	
	public void dameNombre(int pos) {
		System.out.println(camada[pos].getNombreGato());
	}
	
}

