package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

public class Alumnos {
	
	private AlumnosBrillantes nombre;
	private int nota;
	
	public Alumnos(AlumnosBrillantes nombre, int nota) throws AndreiException, AsierException {
		super();
	
		if(nombre == AlumnosBrillantes.ANDREI) {
			
			AndreiException excepcionAndrei = new AndreiException();
			throw excepcionAndrei;
			
		}else if(nombre == AlumnosBrillantes.ASIER) {
		
			throw new AsierException();
			
		}
		
		this.nota = nota;
	}
	
	

}
