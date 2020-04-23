package boletines.boletin3C.bol3_POO.Apartado1.Ej7;

public class PedidosPizza {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza(Pizza.TAMA_MEDIANA, Pizza.TIPO_MARGARITA);
		Pizza p2 = new Pizza(Pizza.TAMA_FAMILIAR, Pizza.TIPO_FUNGHI);
		p2.sirve();
		Pizza p3 = new Pizza(Pizza.TAMA_MEDIANA, Pizza.TIPO_CUATRO_QUESOS);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		p2.sirve();
		
		System.out.println("Pedidas: "+Pizza.getTotalPedidas());
		System.out.println("Servidas: "+Pizza.getTotalServidas());
		
	}

}
