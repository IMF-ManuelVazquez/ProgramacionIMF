package extra.interfazAdivinarProfe;

public class Juego {

	public static void main(String[] args) {
		
		PruebaManuel juego = new PruebaManuel();
		System.out.println(juego.comunidadProcedencia(Comunidad.GALICIA));
		System.out.println(juego.imparte(Asignaturas.ENTORNOS));
		System.out.println(juego.imparte(Asignaturas.PROGRAMACION));
		System.out.println(juego.elProfesorBuscadoEs(Profesores.MANUEL_VAZQUEZ));
		

	}

}
