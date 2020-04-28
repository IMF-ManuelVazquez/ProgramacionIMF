package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.Peluqueria;

public class Peluqueria {
	
//	public static final String SERVICIO_CORTE = "CORTE";
//	public static final String SERVICIO_LAVADO = "LAVADO";
//	public static final String SERVICIO_AFEITADO = "AFEITADO";
//	public static final String SERVICIO_TINTE = "TINTE";
//	
//	public static final String DESCUENTO_NORMAL = "NORMAL";
//	public static final String DESCUENTO_PREMIUM = "PREMIUM";
//	public static final String DESCUENTO_GOLD = "GOLD";
	
	private Servicios servicio = Servicios.LAVADO;
	private Descuentos descuento = Descuentos.NORMAL;
	
	
	public Peluqueria(Servicios servicio, Descuentos descuento) {
		super();
		this.servicio = servicio;
		this.descuento = descuento;
	}
	
	public double calcularImporte() {
		return this.servicio.getPrecio() - (this.servicio.getPrecio() * this.descuento.getDescuento());
	}
	
	
//	public double calcularImporte() {
//		double precio= 0;
//		
//		if (this.servicio.equals(Servicios.CORTE)) {
//			precio = 5;
//		}else if (this.servicio.equals(Servicios.LAVADO)) {
//			precio = 2;
//		}else if (this.servicio.equals(Servicios.AFEITADO)) {
//			precio = 1;
//		}else if (this.servicio.equals(Servicios.TINTE)) {
//			precio = 3;
//		}
//		
//		if (this.descuento.equals(Descuentos.NORMAL)) {
//			// precio = precio;
//		}else if (this.descuento.equals(Descuentos.PREMIUM)) {
//			precio = precio - (precio*0.05);
//		}else if (this.descuento.equals(Descuentos.GOLD)) {
//			precio = precio - (precio*0.1);
//		}
//		
//		return precio;
//		
//	}
	
	
	
}
