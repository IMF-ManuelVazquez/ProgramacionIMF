package boletines.boletin3C.bol3_POO.Apartado1.Ej5;

public class CuentaAhorros {
	
	private static double anualInterestRate;
	private double balancePrivado;
	
	public CuentaAhorros(double balancePrivado) {
		this.balancePrivado = balancePrivado;
	}
	
	public double calcularInteresMensual() {
		return (this.balancePrivado*(anualInterestRate/12));
	}
	
	public static void modificarInterestRate(double interestRate) {
		anualInterestRate = interestRate;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [balancePrivado=" + balancePrivado + "]";
	}
	
	
}
