package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaAnimal;

public class MainPrueba {

	public static void main(String[] args) {
		
		//Animal animal = new Animal("especie", "color", "alimentacion");
		Animal tigre = new Tigre("ff", "red", "ff", 4);
		Animal jirafa = new Jirafa("dd", "blue", "gg", 3, 4);

		
		jirafa.beber();

//		Animal animalReturn = realizarAccionesObj(animal);
//		Tigre tigreReturn = (Tigre) realizarAccionesObj(tigre);
//		Jirafa jirafaReturn = (Jirafa) realizarAccionesObj(jirafa);
//		
//		
//		Animal animalSalvaje = new Animal("especie", "color", "alimentacion");
//		animalSalvaje = new Tigre("ff", "red", "ff", 4);
//		animalSalvaje = new Jirafa("dd", "blue", "gg", 3, 4);
//		
//		animalSalvaje = tigre;
//		Tigre tigre2 = (Tigre) animalSalvaje;  // Casting objeto
//		
//		// Polimorfismo : Muchas formas.
		
	}
	
	public static Animal realizarAccionesObj(Animal animal) {
		animal.comer();
		animal.beber();
		animal.dormir();
		return animal;
	}
	
//	public static void realizarAccionesObj(Tigre tigre) {
//		tigre.comer();
//		tigre.beber();
//		tigre.dormir();
//		//tigre.rugir();
//	}
//	
//	public static void realizarAccionesObj(Jirafa jirafa) {
//		jirafa.comer();
//		jirafa.beber();
//		jirafa.dormir();
//		jirafa.alcanzarCimaArbol();
//	}

}
