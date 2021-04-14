package entidad;

import java.util.ArrayList;

public class Venta {
	
	//Atributos
	
	private static int count = 1;
	private int idVenta;
	Factura factura;
	
	public Venta(Factura factura) {
		super();
		this.idVenta = count++;
		this.factura = factura;
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


	public static void setCount(int count) {
		Venta.count = count;
	}


	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}

		
	//Metodo toString()
	@Override
	public String toString() {
		return "Venta [idVenta= " + idVenta + "] , [factura= " + factura + " ]";
	}
	
	
	
}
