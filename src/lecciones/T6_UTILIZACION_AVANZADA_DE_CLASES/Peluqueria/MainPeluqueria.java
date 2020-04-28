package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Peluqueria;

public class MainPeluqueria {

	public static void main(String[] args) {
	
		Peluqueria pelu = new Peluqueria(Servicios.CORTE, Descuentos.PREMIUM);
		System.out.println(pelu.calcularImporte());
		
		
//		Servicios servicio = Servicios.CORTE;
//		System.out.println(servicio.getPrecio());
//		System.out.println(servicio.getPrecio1());
//		System.out.println(servicio.getPrecio2());
//		
//		Descuentos descuento = Descuentos.GOLD;
//		System.out.println(descuento.getDescuento());

	}

}
