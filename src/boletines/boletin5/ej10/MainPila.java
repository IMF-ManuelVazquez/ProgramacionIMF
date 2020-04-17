package boletines.boletin5.ej10;

public class MainPila {
	
	public static void main(String[] args) {
		
		Pila pila = new Pila();
		pila.mostrarPila();
		pila.inicializarPila();
		
		pila.mostrarPila();
		System.out.println("longitud: "+pila.longitudPila());
		System.out.println("buff lleno? "+pila.estaLlenaPila());
		
		pila.addPila("andrei");
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();
		
		pila.addPila("Gonzalo");
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();
		
		pila.addPila("Adrian");
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();

	
		System.out.println("SACAR un elemento de la pila:" +pila.sacarDeLaPila());
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();
		
		System.out.println("SACAR un elemento de la pila:" +pila.sacarDeLaPila());
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();
		
		System.out.println("SACAR un elemento de la pila:" +pila.sacarDeLaPila());
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();
		
		System.out.println("SACAR un elemento de la pila:" +pila.sacarDeLaPila());
		System.out.println("longitud: "+pila.longitudPila());
		pila.mostrarPila();
		
	}

}
