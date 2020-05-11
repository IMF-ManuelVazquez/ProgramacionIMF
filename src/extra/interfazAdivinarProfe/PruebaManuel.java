package extra.interfazAdivinarProfe;

public class PruebaManuel implements InterfazAdivinarProfesor{

	@Override
	public boolean imparte(Asignaturas asignatura) {
		if (asignatura==Asignaturas.PROGRAMACION) {
			return true;
		}
		return false;
	}

	@Override
	public boolean numeroAsignaturasQueImparte(int numAsignaturas) {
		
		if (numAsignaturas==1) {
			return true;
		}
	
		return false;
	}

	@Override
	public boolean horasDeClasePorSemana(int horas) {
		
		if (horas == 5) {
			return true;
		}
		return false;
	}

	@Override
	public boolean suSexo(Sexo sexo) {
		
		if (sexo==Sexo.HOMBRE) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean comunidadProcedencia(Comunidad comunidad) {
		
		if (comunidad == Comunidad.GALICIA) {
			return true;
		}

		return false;
	}

	@Override
	public boolean elProfesorBuscadoEs(Profesores profesor) {
		
		if (profesor==Profesores.MANUEL_VAZQUEZ) {
			return true;
		}
		
		return false;
	}


}
