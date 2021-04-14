package entidad;

import java.util.ArrayList;

public class Venta {
	
	//Atributos
	
	private static int count = 1;
	private int idVenta;
	Factura factura;
	private float MontoTotal;
	
	public Venta(Factura factura) {
		super();
		this.idVenta = count++;
		this.factura = factura;
		this.MontoTotal = calcularMonto(factura);
			  }
	
	public float calcularMonto(Factura factura) {
		
		float monto = 0; 
		
		for (Entrada entradas : factura) {
			
			monto += entradas.getPrecio();
		}
		
		return monto;
		
	}
	
	// Getters & Setters
	
	public static int getCount() {
		return count;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public Factura getFactura() {
		return factura;
	}

	public float getMontoTotal() {
		return MontoTotal;
	}

	public static void setCount(int count) {
		Venta.count = count;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public void setMontoTotal(float montoTotal) {
		MontoTotal = montoTotal;
	}

	//Metodo toString()
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", factura=" + factura + ", MontoTotal=" + MontoTotal + "]";
	}
	


	
	
	
}
