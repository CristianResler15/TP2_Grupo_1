package entidad;

import java.util.ArrayList;

public class Factura {
	
	//Atributos
	
	private static int count = 1;
	private int numeroFactura;
	ArrayList<Entrada> entradas;
	Fecha fechaDeVenta;
	Cliente cliente;
	private int cantEntradasAdquiridas;

	
	//Constructor con parametros
	public Factura(ArrayList<Entrada> entradas, Fecha fechaDeVenta, Cliente cliente) {
		super();
		this.numeroFactura = count++;
		this.entradas = entradas;
		this.fechaDeVenta = fechaDeVenta;
		this.cliente = cliente;
		this.cantEntradasAdquiridas = entradas.size();
	}

	//Getters & Setters
	
	public static int getCount() {
		return count;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public ArrayList<Entrada> getEntrada() {
		return entradas;
	}

	public Fecha getFechaDeVenta() {
		return fechaDeVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getCantEntradasAdquiridas() {
		return cantEntradasAdquiridas;
	}

	public static void setCount(int count) {
		Factura.count = count;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public void setEntrada(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public void setFechaDeVenta(Fecha fechaDeVenta) {
		this.fechaDeVenta = fechaDeVenta;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setCantEntradasAdquiridas(int cantEntradasAdquiridas) {
		this.cantEntradasAdquiridas = cantEntradasAdquiridas;
	}

	//metodo toString()
	@Override
	public String toString() {
		return "Factura [numeroFactura=" + numeroFactura + ", entrada=" + entradas + ", fechaDeVenta=" + fechaDeVenta
				+ ", cliente=" + cliente + ", cantEntradasAdquiridas=" + cantEntradasAdquiridas + "]";
	}

	
	

}
