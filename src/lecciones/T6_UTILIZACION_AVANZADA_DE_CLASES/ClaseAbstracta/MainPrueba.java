package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.ClaseAbstracta;

public class MainPrueba {

	public static void main(String[] args) {
		
		//Animal animal = new Animal("especie", "color", "alimentacion");
		Animal tigre = new Tigre("tigreEspecie", "colorRed", "carnivoro", 4);
		Animal jirafa = new Jirafa("jirafaEspecie", "colorBlue", "herbivoro", 3, 4);
		
		realizarAccionesObj(tigre);
		realizarAccionesObj(jirafa);
		
	}
	
	public static Animal realizarAccionesObj(Animal animal) {
		animal.comer();
		animal.beber();
		animal.dormir();
		return animal;
	}
	
}
