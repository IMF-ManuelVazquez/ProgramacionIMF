package extra.interfazAdivinarProfe;

public interface InterfazAdivinarProfesor {

	public boolean imparte(Asignaturas asignatura);
	public boolean numeroAsignaturasQueImparte(int numAsignaturas);
	public boolean horasDeClasePorSemana(int horas);
	public boolean suSexo(Sexo sexo);
	public boolean comunidadProcedencia(Comunidad comunidad);
	public boolean elProfesorBuscadoEs(Profesores profesor);
	
}
