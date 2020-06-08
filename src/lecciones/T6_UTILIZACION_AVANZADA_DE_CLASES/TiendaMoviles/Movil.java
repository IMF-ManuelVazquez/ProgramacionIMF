package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.TiendaMoviles;

public abstract class Movil {
	
	EstadoMovil estado = EstadoMovil.APAGADO;
	DisponibilidadMovil disponibilidad = DisponibilidadMovil.OFF;
	

	public void cambiarEstadoMovil(EstadoMovil estado) {
		
		if (estado.equals(EstadoMovil.APAGADO)) {
			estado = EstadoMovil.APAGADO;
			this.disponibilidad = DisponibilidadMovil.OFF;
		}else if (estado.equals(EstadoMovil.ENCENDIDO)) {
			
			this.estado=EstadoMovil.ENCENDIDO;
			
			if (this.disponibilidad.equals(DisponibilidadMovil.OFF)) {
				this.disponibilidad = DisponibilidadMovil.DISPONIBLE;
			}
		}
	}
	
	public void cambiarDisponibilidadMovil(DisponibilidadMovil disponibilidad) {
		
		if (disponibilidad.equals(DisponibilidadMovil.OFF)) {
			this.estado=EstadoMovil.APAGADO;
			this.disponibilidad = DisponibilidadMovil.OFF;
		}else if (this.estado.equals(EstadoMovil.ENCENDIDO)) {
			this.disponibilidad = disponibilidad;
		}
		
	}
	
	// Retorne true si puedo llamar y false sino puedo llamar.
	public boolean llamar() {
		if (this.disponibilidad.equals(DisponibilidadMovil.DISPONIBLE)) {
			return true;
		}
		return false;
	}
	
	public boolean telefonoOcupado() {
		if (this.disponibilidad.equals(DisponibilidadMovil.COMUNICANDO)) {
			return true;
		}
		return false;
	}
	
	public boolean apagadoOFueraCobertura() {
		if (this.estado.equals(EstadoMovil.APAGADO)) {
			return true;
		}
		if (this.disponibilidad.equals(DisponibilidadMovil.MODO_AVION) || this.disponibilidad.equals(DisponibilidadMovil.SIN_COBERTURA)) {
			return true;
		}
		return false;
	}
	
	public abstract void mensajeBienvenida();

	@Override
	public String toString() {
		return "Movil [estado=" + estado + ", disponibilidad=" + disponibilidad + "]";
	}
	
	
	

}
