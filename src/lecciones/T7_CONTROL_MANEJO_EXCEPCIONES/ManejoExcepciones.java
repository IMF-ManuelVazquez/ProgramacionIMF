package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

import java.util.ArrayList;
import java.util.Scanner;

import boletines.boletin3C.bol3_POO.Apartado2.Ej6.Articulo;

public class ManejoExcepciones {

	public static void main(String[] args) {
		
		//errorVectores();
		//excepcionColeccion();
		//excepcionConversionEntero();
		//usoNullPointerExcepction();
		
		Scanner entradaScanner = new Scanner(System.in);
		int num = entradaScanner.nextInt();
		
			try {
				tratarNumero(num);
			} catch (ExceptionPropia e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	
	public static void tratarNumero(int num) throws ExceptionPropia {
		
		System.out.println("tratar numero");
		if (num==0) {
			throw new ExceptionPropia("TExto para mi propia excepcion");
		}else if(num==10){
			throw new IndexOutOfBoundsException("Numero muy alto para poder trabajar con el");
		}else if(num<0) {
			throw new ArithmeticException("No puedo trabajar no numeros negativos"); 
		}
		System.out.println("sin tratar numero");
		
	}
	
	
	
	public static void dividirZero() throws ArithmeticException{
		
		//try {
			int value = 5/0;
		//}catch (ArithmeticException e) {
		//	System.out.println("tratao dentro el metodo dividirZero y ya se que hacer");
		//}
		
	}
	
	public static void errorVectores() {
		
		
			int[] v = new int[5];
			System.out.println(v[6]);
		
		
	}
	
	public static void usoNullPointerExcepction() {
		
		try {
			String[] v = new String[2];
			v[0].equals("hola");
		}catch (NullPointerException e) {
			// TODO: handle exception
		}
				
	}
	
	
	public static void excepcionColeccion() {
		ArrayList<Integer> coleccionEnteros = new ArrayList<Integer>();
		coleccionEnteros.add(5);
		System.out.println(coleccionEnteros.get(8));
	}
	
	public static void problemaScanner() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor");
		int value = sc.nextInt();
		System.out.println(value);
		
	}

	public static void excepcionConversionEntero() {
		
		try {

			String valueStr = "22";
			int valueInt = Integer.valueOf(valueStr);
			System.out.println(valueInt+5);
			System.out.println("hola mundo");
			valueInt *= 5;
			System.out.println(valueInt);
			int[] v = new int[4];
			v[0] = valueInt;

		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			System.out.println("plan A: problema con el integer");
			problemaScanner();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("plan b: problema con el vector");
			errorVectores();
			
		} catch (Exception e) {
			
			System.out.println("Plan C: El por si acaso.... Excepcion generica");
			excepcionConversionEntero();
			
		} finally {
			
			System.out.println("Esto siempre se ejecutar siempre siempre y siempre");
			
		}
		
		
	
		
		
		
		
		
		
		
	}
	
}
