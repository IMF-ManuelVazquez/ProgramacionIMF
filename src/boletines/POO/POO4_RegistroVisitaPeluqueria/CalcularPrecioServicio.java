package boletines.POO.POO4_RegistroVisitaPeluqueria;

public class CalcularPrecioServicio {
	
	private final static double PRECIO_DEFAULT_CORTE = 10;
	private final static double PRECIO_DEFAULT_LAVADO = 3.5;
	private final static double PRECIO_DEFAULT_AFEITADO = 5;
	private final static double PRECIO_DEFAULT_TINTE = 5;
	
	private final static double DESCUENTO_PREMIUM = 0.2;
	private final static double DESCUENTO_GOLD = 0.15;
	private final static double DESCUENTO_SILVER = 0.1;
	
	public static double getPrecioServicio(Descuentos descuento, Servicios servicio) {
		
		double precio = 0;
		
		if (servicio.equals(Servicios.CORTE)) {
			precio = PRECIO_DEFAULT_CORTE;
		}else if (servicio.equals(Servicios.LAVADO)) {
			precio = PRECIO_DEFAULT_LAVADO;
		}else if (servicio.equals(Servicios.AFEITADO)) {
			precio = PRECIO_DEFAULT_AFEITADO;
		}else if (servicio.equals(Servicios.TINTE)) {
			precio = PRECIO_DEFAULT_TINTE;
		}
		
		
		if (descuento.equals(Descuentos.PREMIUM)) {
			precio = precio - (precio * DESCUENTO_PREMIUM);
		}else if (descuento.equals(Descuentos.GOLD)) {
			precio = precio - (precio * DESCUENTO_GOLD);
		}else if (descuento.equals(Descuentos.SILVER)) {
			precio = precio - (precio * DESCUENTO_SILVER);
		}
		
		return precio;
		
		
	}
	

}
