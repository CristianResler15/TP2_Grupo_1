package entidad;

public class VentaEntradas {
	
	//Atributos
	
	private static int count = 1;
	private int numeroFactura;
	Fecha fechaDeVenta;
	Cliente cliente;
	private float montoTotal;
	private int cantEntradasAdquiridas;
	
	//Constructor con parametros
	
	public VentaEntradas(Fecha fechaDeVenta, Cliente cliente, float montoTotal, int cantEntradasAdquiridas) {
		super();
		this.numeroFactura = count++;
		this.fechaDeVenta = fechaDeVenta;
		this.cliente = cliente;
		this.montoTotal = montoTotal*cantEntradasAdquiridas;
		this.cantEntradasAdquiridas = cantEntradasAdquiridas;
	}
	
	
	//Getters & Setters

	public static int getCount() {
		return count;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public Fecha getFechaDeVenta() {
		return fechaDeVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public int getCantEntradasAdquiridas() {
		return cantEntradasAdquiridas;
	}

	public static void setCount(int count) {
		VentaEntradas.count = count;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public void setFechaDeVenta(Fecha fechaDeVenta) {
		this.fechaDeVenta = fechaDeVenta;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public void setCantEntradasAdquiridas(int cantEntradasAdquiridas) {
		this.cantEntradasAdquiridas = cantEntradasAdquiridas;
	}

	
	//metodo toString()
	@Override
	public String toString() {
		return "Entrada generada = [numeroFactura= " + numeroFactura + " ] , [fechaDeVenta= " + fechaDeVenta + " ] , [cliente= "
				+ cliente + "] , [montoTotal= " + montoTotal + " ] , [cantEntradasAdquiridas= " + cantEntradasAdquiridas + " ]";
	}



}