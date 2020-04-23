package boletines.boletin3C.bol3_POO.Apartado1.Ej9;

public class Matematicas {

	
	// 3223  >>> "3223"     "321123"
	// 3323
	
	public static boolean esCapicua(int num) {
		
		String str = String.valueOf(num);
		int strSize = str.length();
		boolean capicua = true;
		for (int i = 0; i < strSize/2; i++) {
			if (str.charAt(i)!=str.charAt(strSize-1-i)) {
				capicua=false;
			}
		}
		return capicua;
		
	}
	
	public static boolean esPrimo(int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
	
	
	public static int siguientePrimo (int num) {
		
		do {
			num++;
		}while(esPrimo(num)==false);
		
		return num;
	}
	
	
	public static double potencia (int base, int exp) {
		return Math.pow(base, exp);
	}
  
	public static int digitos(int num) {
		String str = String.valueOf(num);
		int strSize = str.length();
		return strSize;
	}
	
	// 123  >>> 321
	public static int voltea(int num) {
		String str = String.valueOf(num);
		int strSize = str.length();
		String out = "";
		for (int i = 0; i < strSize; i++) {
			out = out + str.charAt(strSize-1-i);
		}
		return Integer.parseInt(out);
	}
	
	public static int digitoN(int num, int pos) {
		String str = String.valueOf(num);
		if ((pos >= str.length())||(pos<0)) {
			return -1;
		}else {
			char inChar = str.charAt(pos);
			return Character.getNumericValue(inChar);		
		}
	}

	// 123   4  >> -1     2   >> 1
	public static int posicionDeDigito(int num, int digitoBuscado) {
		char inChar = String.valueOf(digitoBuscado).charAt(0);
		
		System.out.println("Buscando in Char: "+inChar);
		
		String str = String.valueOf(num);
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)==inChar) {
//				return i;
//			}
//		}
//		
//		return -1;
		
		return str.indexOf(inChar);
	}
	
	
	// 12345   quitePorDestras(2)    123
	public static int quitaPorDetras(int num, int numeroDeDigitos) {
		String str = String.valueOf(num);
		if (numeroDeDigitos>=str.length()) {
			return -1;
		}else {
			str = str.substring(0, str.length()-numeroDeDigitos);
			return Integer.parseInt(str);
		}
	}
	
	
	// 12345  quitaPorDelante(2)   345
	public static int quitaPorDelante(int num, int numeroDeDigitos) {
		String str = String.valueOf(num);
		if (numeroDeDigitos>=str.length()) {
			return -1;
		}else {
			str = str.substring(numeroDeDigitos, str.length());
			return Integer.parseInt(str);
		}
	}
	
	// 12345  99  >>> 1234599
	public static int pegaPorDetras(int num, int numPegar) {
		String str = String.valueOf(num);
		String str2 = String.valueOf(numPegar);
		str = str + str2;
		return Integer.parseInt(str);
	}
	
	// 12345 99  >> 9912345
	public static int pegaPorDelante(int num, int numPegar) {
		String str = String.valueOf(num);
		String str2 = String.valueOf(numPegar);
		str =  str2 + str;
		return Integer.parseInt(str);
	}
	
	public static int trozoDeNumero(int num, int posIni, int posFin) {
		String str = String.valueOf(num);
		str = str.substring(posIni, posFin+1);
		return Integer.parseInt(str);
	}
	
}
