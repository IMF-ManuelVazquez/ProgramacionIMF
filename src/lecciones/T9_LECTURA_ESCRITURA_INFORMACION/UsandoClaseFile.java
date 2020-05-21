package lecciones.T9_LECTURA_ESCRITURA_INFORMACION;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UsandoClaseFile {
	
	private final static String HOME = System.getProperty("user.home");

	public static void main(String[] args) {
		
//		File file = new File("C:\\Users\\Manu\\\\Desktop\\PROG_FICHEROS\\EJERCICIO_MOVIMIENTOS_FIGURA_AJEDREZ.pdf");
//		System.out.println(file.exists());
//		
//		File ficheroTexto = new File("C:\\Users\\Manu\\\\Desktop\\PROG_FICHEROS\\EJERCICIO_MOVIMIENTOS_FIGURA_AJEDREZ.pdf");
//		File directorioPROG = new File("C:\\Users\\Manu\\Desktop\\PROG_FICHEROS");
//		
//		System.out.println(ficheroTexto.exists());
//		System.out.println(directorioPROG.exists());
//		
//		System.out.println(directorioPROG.isDirectory());
//		System.out.println(Arrays.toString(directorioPROG.list()));
//		
//		System.out.println(ficheroTexto.getAbsolutePath());
//		
//		System.out.println(ficheroTexto.length());  // 150 KB (153.820 bytes)
//		
//		
		
		
		String pathname = HOME+"\\Desktop\\PROG_FICHEROS\\PruebasFicherosScanner.txt";
		//UsarFileWriter(pathname);
		//UsarFileReader(pathname);
		
		//UsarBufferedWriter(pathname);
		//UsarBufferedReader(pathname);
		
		UsarBufferedWriterYScanner(pathname);
		
		//System.out.println(System.getProperty("user.home"));
		
	}
	
	public static void UsarBufferedWriterYScanner(String pathname){
		Scanner entrada_escanner = new Scanner(System.in);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(pathname));
			
			String input = null;
			do {
				System.out.println("Escribe una linea, para salir escribe la palabra \"SALIR\"");
				input = entrada_escanner.nextLine();
				if (input.equals("SALIR")==false){
					bw.write(input);
					bw.newLine();
				}
			}while (input.equals("SALIR")==false);

			System.out.println("Cerrando documento de texto...");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		entrada_escanner.close();
	}
	
	public static void UsarBufferedWriter(String pathname){
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(pathname));
			for (int i = 0; i < 100; i++) {
				bw.write("manuel"+String.valueOf(i));
				bw.newLine();
			}
			//bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void UsarBufferedReader(String pathname) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathname));
			String line = br.readLine();
			int contadorLineas = 0;
			while (line!=null) {
				System.out.println("line "+contadorLineas+": "+line);
				line = br.readLine();
				contadorLineas++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void UsarFileWriter(String pathname) {
		try {
			FileWriter fw = new FileWriter(pathname);
			fw.write("Hola, que ase? mundo clase Prog DAW1");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void UsarFileReader(String pathname) {
		try {
			FileReader fr = new FileReader(pathname);
			int valor = fr.read();
			while(valor!=-1) {
				System.out.print(valor);
				System.out.print("(");
				System.out.print((char)valor);
				System.out.print(")");
				valor=fr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
