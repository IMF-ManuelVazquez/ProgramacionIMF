package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.plataformaAplicacion;

public class PlataformaAplicacion {
	

	public static void main(String[] args) {
//		Cliente cliente1= new Cliente();
//		Cliente cliente2 = new Cliente();
//		
//		System.out.println(cliente1);
//		System.out.println(cliente2);
//		
//		TarjetaDeCredito tarjeta = new TarjetaDeCredito();
//		cliente1.setTarjetaDeCredito(tarjeta);
//		cliente2.setTarjetaDeCredito(tarjeta);
//		
//		System.out.println(cliente1);
//		System.out.println(cliente2);
//		
//		cliente1.setTarjetaDeCredito(null);
		
		Cliente cliente1 = new Cliente(22, "manolito", 44, "pepe");
		Cliente cliente2 = new Cliente(23, "luisito", 66, "jose");
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		TarjetaDeCredito tarjeta = new TarjetaDeCredito(11, 100);
		cliente2.setTarjetaDeCredito(tarjeta);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
	}

}
