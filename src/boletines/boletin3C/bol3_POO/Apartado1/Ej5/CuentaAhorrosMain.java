package boletines.boletin3C.bol3_POO.Apartado1.Ej5;

public class CuentaAhorrosMain {

	public static void main(String[] args) {
		
		CuentaAhorros.modificarInterestRate(0.3);
		
		CuentaAhorros cuenta1 = new CuentaAhorros(1000);
		CuentaAhorros cuenta2 = new CuentaAhorros(2000);

		System.out.println("CalcularInterestMensual: "+cuenta1.calcularInteresMensual());
		System.out.println("CalcularInterestMensual: "+cuenta2.calcularInteresMensual());
		
		CuentaAhorros.modificarInterestRate(0.5);
		
		System.out.println("CalcularInterestMensual: "+cuenta1.calcularInteresMensual());
		System.out.println("CalcularInterestMensual: "+cuenta2.calcularInteresMensual());

	}

}

