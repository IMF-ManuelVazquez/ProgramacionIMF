package boletines.boletin5.ej9;

import java.util.Scanner;

public class MainPruebas {

	public static void main(String[] args) {
		


		ConversorEuros.convertirDivisas(222,ConversorEuros.CONVERTIR_LIBRA);
		ConversorEuros.convertirDivisas(100, ConversorEuros.CONVERTIR_YEN);
		ConversorEuros.convertirDivisas(100, "AFDSFA");
		
		ConversorEuros.convertirDivisas(100);
	

	}

}