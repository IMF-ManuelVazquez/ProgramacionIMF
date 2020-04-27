package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class Concesionario {

	public static void main(String[] args) {

		Furgoneta furgo = new Furgoneta(100, 1000, "Red", 2000);
		Ford ford = new Ford(160, 2000, "Yellow", 1985, 2);
		Sedan sedan = new Sedan(150, 2300, "Blue", 120);

		System.out.println(furgo);
		System.out.println(ford);
		System.out.println(sedan);


		System.out.println("GET SALE PRICE");
		System.out.println(furgo.getSalePrice());
		System.out.println(ford.getSalePrice());
		System.out.println(sedan.getSalePrice());
		
		System.out.println(furgo.getSpeed());
	}

}
