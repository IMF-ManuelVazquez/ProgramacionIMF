package extra;

public class gggg {
	
	public static void main(String[] args) {
		
		String str1 = "hola";
		String str2 = "hola";
		
		// Comparar objetos
		System.out.println(str1 == str1);  // true
		System.out.println(str1 == str2);  // false
		System.out.println(str1 == null);  // false
		System.out.println(null == str1);  // false
		
		// Comparar contenido de Strings
		System.out.println(str1.equals(str1));  // true
		System.out.println(str1.equals(str2));  // true
		System.out.println(str1.equals(null));  // false
		//System.out.println(null.equals(str1));  // Error! null no tiene el método "equals"
		
		
		
	}

}
