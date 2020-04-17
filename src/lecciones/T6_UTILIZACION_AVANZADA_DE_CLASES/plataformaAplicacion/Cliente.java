package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.plataformaAplicacion;

public class Cliente {
	private int codCliente;
	private String nombre;
	private TarjetaDeCredito tarjetaDeCredito;
	private Vendedor vendedor;
	
	public Cliente() {
		this.vendedor = new Vendedor();
	}
	
	public Cliente(int codCliente, String nombre, int codVendedor, String nombreVendedor) {
		super();
		this.codCliente = codCliente;
		this.nombre = nombre;
		this.vendedor = new Vendedor(codVendedor, nombreVendedor);
	}


	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nombre=" + nombre + ", tarjetaDeCredito=" + tarjetaDeCredito
				+ ", vendedor=" + vendedor + "]";
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TarjetaDeCredito getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}

	public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}
	
	public void añadirTarjeta(TarjetaDeCredito tarjetaDeCredito) {
		if (tarjetaDeCredito.getLimite()<0) {
			System.out.println("tarjeta incorrecta");
		}else {
			System.out.println("tarjeta correcta y añadida");
			this.tarjetaDeCredito = tarjetaDeCredito;
		}
	}
	
}
