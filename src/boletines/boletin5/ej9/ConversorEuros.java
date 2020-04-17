package boletines.boletin5.ej9;

public class ConversorEuros {
	
	private final static double DOLAR =  1.08;
	private final static double YEN = 120.1;
	private final static double LIBRA = 0.93;
	
	public final static String CONVERTIR_DOLAR = "DOLAR";
	public final static String CONVERTIR_YEN = "YEN";
	public final static String CONVERTIR_LIBRA = "LIBRA";
	
	// Metodo de clase >> static
	public static void convertirDivisas (int euros, String destinatario) {
		
		double resultado;
		if (destinatario.toUpperCase().equals(CONVERTIR_DOLAR)) {
			resultado = euros * DOLAR;
		}else if (destinatario.toUpperCase().equals(CONVERTIR_YEN)) {
			resultado = euros * YEN;
		}else if (destinatario.toUpperCase().equals(CONVERTIR_LIBRA)){
			resultado = euros * LIBRA;
		}else {
			resultado = 0;
			destinatario = "ERRONEO";
		}
		System.out.println("La conversion de "+euros+" Euros en "+ destinatario+" es "+resultado);
	}
	
	public static void convertirDivisas(int euros) {
		double resultado = euros * DOLAR;
		System.out.println("La conversion de "+euros+" Euros en DOLAR es "+resultado);
		
		resultado = euros * YEN;
		System.out.println("La conversion de "+euros+" Euros en YEN es "+resultado);
		
		resultado = euros * LIBRA;
		System.out.println("La conversion de "+euros+" Euros en LIBRA es "+resultado);
	}
	

}
