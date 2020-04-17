package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.relacionesAsociacion;

public class MainPrueba {
	
	

	public static void main(String[] args) {
		
		Clase1 clase1;
		clase1 = new Clase1("fff", 2);
		clase1.toString();
		
//		Clase2 clase2 = new Clase2("fff", 2);
//		clase2.toString();
		
		Clase3 clase3 = new Clase3("fff", 2);
		clase3.toString();
		
		clase1.setObjetoClase3(clase3);
		
//		Clase1 clase1plus = new Clase1("gg", 3, clase3);
		
		
		System.out.println(clase1);
		System.out.println(clase1.getObjetoClase3());
		
		
	}

}
