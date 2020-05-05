package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaClaseAbstractaInterfazVIDEO;

public class Tigre implements InterfazAnimal, InterfazCarnivoro{

	@Override
	public void comer() {
		System.out.println("Tigre comer");
	}

	@Override
	public void beber() {
		// TODO Auto-generated method stub
		System.out.println("tigre bebe");
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comerCarne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cazar() {
		// TODO Auto-generated method stub
		
	}

}
