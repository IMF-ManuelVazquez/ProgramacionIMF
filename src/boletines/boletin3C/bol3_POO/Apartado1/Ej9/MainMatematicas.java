package boletines.boletin3C.bol3_POO.Apartado1.Ej9;

public class MainMatematicas {

	public static void main(String[] args) {
		
		System.out.println("esCapicua:");
		System.out.println(Matematicas.esCapicua(3223));
		System.out.println(Matematicas.esCapicua(3233));
		
		System.out.println("esPrimo");
		System.out.println(Matematicas.esPrimo(23));
		System.out.println(Matematicas.esPrimo(22));
		
		System.out.println("siguientPrimo");
		System.out.println(Matematicas.siguientePrimo(21));
		
		System.out.println("potencia");
		System.out.println(Matematicas.potencia(2,2));
		
		System.out.println("digitos");
		System.out.println(Matematicas.digitos(12345));
		
		System.out.println("voltea");
		System.out.println(Matematicas.voltea(12345));
		
		System.out.println("digitoN");
		System.out.println(Matematicas.digitoN(12345, 2));
		
		System.out.println("posicionDeDigito");
		System.out.println(Matematicas.posicionDeDigito(12345, 4));
		
		System.out.println("quitaPorDetras");
		System.out.println(Matematicas.quitaPorDetras(12345, 2));
		
		System.out.println("quitaPorDelante");
		System.out.println(Matematicas.quitaPorDelante(12345, 2));
		
		System.out.println("pegaPorDetras");
		System.out.println(Matematicas.pegaPorDetras(12345, 999));
		
		System.out.println("pegaPorDelante");
		System.out.println(Matematicas.pegaPorDelante(12345, 999));
		
		System.out.println("trozoNumero");
		System.out.println(Matematicas.trozoDeNumero(12345, 1, 3));

	}

}
