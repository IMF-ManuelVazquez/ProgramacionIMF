package lecciones.T8_COLECCIONES_DE_DATOS.ArrayList;

import java.util.ArrayList;

public class ForEach {
	
	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("manuel");
		nombres.add("cesar");
		nombres.add("ada");
		nombres.add("gonzalo");
		nombres.add("adrian");
		
		
		// FOR CLASSIC.
		// Size() = 5
		
		for (int i = 0; i < nombres.size(); i++) {
			
			String nombre = nombres.get(i);
			System.out.println(nombre);
			
		}
		
		// i = 0ç
		// i = 1
		// i = 2
		
		for (int i = 1; i < nombres.size(); i=i+2) {
			
			String nombre = nombres.get(i);
			System.out.println(nombre);
		}
		
		// i = 1   nombres.add("cesar");
		// i = 1+2 = 3   nombres.add("gonzalo");
		// i = 3 + 2 = 5   -- FUERA DEL FOR
		
		
		for (int i = 1; i < 1; i++) {
			String nombre = nombres.get(i);
			System.out.println(nombre);
		}
		
		// i = 1  -- FUERA DEL FOR
		
		
	}
	

}
