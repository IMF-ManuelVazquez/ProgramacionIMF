package lecciones.T7_CONTROL_MANEJO_EXCEPCIONES;

public class ClasePadre {
	
	public void esperar(int time) throws InterruptedException {
		
		Thread.sleep(time);
		
	}
	
	public void lanzarPropiaExcepcion() throws ExceptionPropia{
		throw new ExceptionPropia("mi propia excepcion");
	}

}
