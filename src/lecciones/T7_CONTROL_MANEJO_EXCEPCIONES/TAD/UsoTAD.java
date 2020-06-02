package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES.TAD;

public class UsoTAD {

	public static void main(String[] args) {
		
		FIFO fifo = new FIFO();
		
		for (int i = 0; i < 30; i++) {
			
			try {

				fifo.push("hola");
				
			} catch (TADLlenado e) {
				// TODO Auto-generated catch block
				System.out.println("TADllenado");

			} catch (TADLleno e) {
				// TODO Auto-generated catch block
				System.out.println("TADLleno");
			}
			
		}
		
		
		
	}
}
