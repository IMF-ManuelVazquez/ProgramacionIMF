package boletines.boletin5.ej6;

public class MetodoDeAcceso {

	private final int DESCONECTADO = 0;
	private final int CONECTADO = 1;
	private final int BLOQUEADO = 2;
	private final int REINICIO_INTENTOS = 5;
	private int estadoAcceso = DESCONECTADO;
	private String usuario;
	private String password;
	private int numIntentos = 5;

	private String PUK = "ASDF123QWE";

	// constructores
	public MetodoDeAcceso(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
		//Valores por defecto
		//this.numIntentos=5;
		//this.PUK = "ASDF123QWE";
		//this.estado = DESCONECTADO;
	}

	public MetodoDeAcceso(String usuario, String password, int numIntentos) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.numIntentos = numIntentos;

		//this.PUK = "ASDF123QWE";
		//this.estado = DESCONECTADO;
	}

	// Metodos.
	public boolean estadoConectado() {
		if (this.estadoAcceso==CONECTADO) {
			return true;
		}else {
			return false;
		}
	}

	public boolean estaBloqueado() {
		// CONECTADO , DESCONECTADO , BLOQUEADO.
		if (this.estadoAcceso==BLOQUEADO) {
			return true;
		}else {
			return false;
		}
	}

	public int obtenerNumeroIntentos() {
		return this.numIntentos;
	}

	public boolean conectado(String user, String pass) {
		// Si acierta cambiara estadoAcceso a Conectado y retorna true.
		
		if (this.estadoAcceso==BLOQUEADO) {
			return false;
		}else {
			if (this.usuario.equals(user) && this.password.equals(pass)) {
				this.estadoAcceso = CONECTADO;
				this.numIntentos=REINICIO_INTENTOS;
				return true;
			}else {
				this.estadoAcceso = DESCONECTADO;
				this.numIntentos--;	
				if (numIntentos==0) {
					this.estadoAcceso=BLOQUEADO;
				}
				return false;
			}
		}
	
		
		//SINO DEJARLO EN DESCONECTAO Y DECRETMANR INTENTOS.


	}

	public boolean desbloquear(String PUK) {
		if (this.estadoAcceso==BLOQUEADO) {
			if (this.PUK.equals(PUK)) {
				this.estadoAcceso=DESCONECTADO;
				this.numIntentos=REINICIO_INTENTOS;	
			}else {
				return false;
			}
		}
		return true;
	}

	public boolean desconectar() {

		if (this.estadoAcceso==CONECTADO) {
			this.estadoAcceso=DESCONECTADO;
			this.numIntentos=REINICIO_INTENTOS;
			return true;
		}else {
			return false;
		}

	}
	
	
	//Getters&Setters&toString

	public int getEstadoAcceso() {
		return estadoAcceso;
	}

	public void setEstadoAcceso(int estadoAcceso) {
		this.estadoAcceso = estadoAcceso;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumIntentos() {
		return numIntentos;
	}

	public void setNumIntentos(int numIntentos) {
		this.numIntentos = numIntentos;
	}

	public String getPUK() {
		return PUK;
	}

	public void setPUK(String pUK) {
		PUK = pUK;
	}

	@Override
	public String toString() {
		String msgEstado;
		if (this.estadoAcceso==CONECTADO) {
			msgEstado = "Dispositivo conectado";
		}else if (this.estadoAcceso==DESCONECTADO) {
			msgEstado = "Dispositivo desconectado";
		}else {
			msgEstado = "Bloqueado";
		}
		
		return "Ej6MetodoDeAcceso [estadoAcceso=" + msgEstado + ", usuario=" + usuario + ", password=" + password
				+ ", numIntentos=" + numIntentos + ", PUK=" + PUK + "]";
	}
}
