package boletines.boletin3C.bol3_POO.Apartado1.Ej7;

public class Pizza {
	
	public static final String TIPO_MARGARITA = "margarita";
	public static final String TIPO_FUNGHI = "funghi";
	public static final String TIPO_CUATRO_QUESOS = "cuatro quesos";
	
	public static final String TAMA_FAMILIAR = "familiar";
	public static final String TAMA_MEDIANA = "mediana";
	public static final String TAMA_PEQUENNO = "pequenno";
	
	private final int ESTADO_PEDIDO = 0;
	private final int ESTADO_SERVIDO = 1;
	
	private String tamanno;
	private String tipo;
	private int estado;  // Si esta pedida: 0  si esta servida : 1
	private static int pedida = 0;
	private static int servida = 0;
	
	public Pizza(String tamanno, String tipo) {
		super();
		this.tamanno = tamanno;
		this.tipo = tipo;
		this.estado = ESTADO_PEDIDO;
		pedida++;
		System.out.println("pizza "+this.tipo+" "+ this.tamanno + " pedido");
	}
	
	public void sirve() {
		if (this.estado==ESTADO_PEDIDO) {
			this.estado = 1;
			servida++;
			pedida--;
			System.out.println("pizza "+this.tipo+" "+ this.tamanno + " servida");
		}else {
			System.out.println("Esa pizza ya se ha servido");
		}
	}
	
	public static int getTotalPedidas() {
		return pedida;
	}
	
	public static int getTotalServidas() {
		 return servida;
	}

	@Override
	public String toString() {
		return "Pizza [tamanno=" + tamanno + ", tipo=" + tipo + ", estado=" + estado + "]";
	}

	
	
	

}
