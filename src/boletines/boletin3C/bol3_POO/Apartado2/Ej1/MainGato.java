package boletines.boletin3C.bol3_POO.Apartado2.Ej1;

import java.util.Arrays;

public class MainGato {

	public static void main(String[] args) {
		
		final int NUMERO_DATOS = 4; 
		int[] vint = new int[NUMERO_DATOS];
		vint[0] = 2;
		
		String[] vstr = new String[NUMERO_DATOS];
		vstr[0] = "garfield";
		vstr[1] = "loli";
		vstr[2] = "momo";
		vstr[3] = "mika";
		
		String[] vcolores = {"gris","naranja","negro","marron"};
		String[] vsexo = {"macho","hembra","hembra","macho"};
		
		Gato[] vGato;
		vGato = new Gato[NUMERO_DATOS]; // [null, null, null, null]
		
		for (int i = 0; i < NUMERO_DATOS; i++) {
			vGato[i] = new Gato(vstr[i],vcolores[i], vsexo[i]);
		}
		// [objGato, objGato, objGato, objGato]
		
		
		for (int i = 0; i < NUMERO_DATOS; i++) {
			System.out.println(vGato[i]);
		}
		
		System.out.println("***************");
		System.out.println(Arrays.toString(vGato));
		

	}

}
