package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES.TAD;

import java.util.ArrayList;

public class FIFO {
	
	private final int MAX = 20;
	ArrayList<String> arr = new ArrayList<String>();
	
	public void push(String input) throws TADLleno, TADLlenado {
		
		if (arr.size()<(MAX-1)) {
			arr.add(input);
		}else if (arr.size()==(MAX-1)) {
			arr.add(input);
			throw new TADLlenado();
		}else {
			throw new TADLleno();
		}
		
	}

}
