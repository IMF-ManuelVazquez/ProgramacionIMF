package boletines.boletin3C.bol3_POO.Apartado1.Ej2;

public class FacturaTest {

	public static void main(String[] args) {
		
		Factura factura = new Factura("ID01", "tornillo", 100, 0.04);
		System.out.println("IMPORTE FACTURA: "+factura.obtenerFactura()+ " Euros");

	}

}
