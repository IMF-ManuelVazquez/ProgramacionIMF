package extra.SplitString;

public class DudaSplit {
	
	public static void main(String[] args) {
		
		String str = "Nombre: PABLO";
		
		System.out.println(str.length());
		
		// Opcion1
		int posicion =0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)==':') {
//				posicion = i;
//			}
//		}
		posicion = str.indexOf(":");
		System.out.println(posicion);
		String nombre = str.substring(posicion+2, str.length());
		System.out.println(nombre);
		
		// Opcion2
		//String[] partes = str.split(": ");
		System.out.println(str.split(": ")[1]);
		
	
		String str2 = "Apellidos: IGLESIAS TURRIÓN";
		System.out.println(str2.split(": ")[0]);
		System.out.println(str2.split(": ")[1]);
	}

}
