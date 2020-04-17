package boletines.boletin3C.bol4_POO_UML.apartado2.ejercicio1;

public class MainBook {

	public static void main(String[] args) {
		
		Autor autor = new Autor("manuel", "manuuel@gmail.com", 'm');
		Autor autor2 = new Autor("pepe", "pepe@gmail.com", 'm');
		System.out.println(autor);
		System.out.println(autor2);
		
		//Autor[] autores = {autor, autor2};
		
		Autor[] autores = new Autor[1];
		autores[0]= autor;
		
		Book libro = new Book("El quijote", autores, 20);
		Book libro2 = new Book("El señor de los anillos", null, 40);
		libro2.setAutor(autores);
		
		
		
		System.out.println(libro);
		System.out.println(libro2);

	}

}
