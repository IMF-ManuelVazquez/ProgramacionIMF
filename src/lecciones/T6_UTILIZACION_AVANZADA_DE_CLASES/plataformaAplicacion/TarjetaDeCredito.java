package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.plataformaAplicacion;

public class TarjetaDeCredito {
	
	private int codTarjeta;
	private double limite;
	
	public TarjetaDeCredito() {
		super();
	}
	
	public TarjetaDeCredito(int codTarjeta, double limite) {
		this.codTarjeta = codTarjeta;
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [codTarjeta=" + codTarjeta + ", limite=" + limite + "]";
	}

	public int getCodTarjeta() {
		return codTarjeta;
	}

	public void setCodTarjeta(int codTarjeta) {
		this.codTarjeta = codTarjeta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
