package entidad;

import java.util.ArrayList;

public class Venta {
	
	private int NumeroFactura;
	private float MontoTotal;
	private ArrayList<Entrada> entradas;
	private Cliente cliente;
	private Fecha fecha;
	
	public Venta(int numeroFactura, float montoTotal, ArrayList<Entrada> entradas, Cliente cliente, Fecha fecha) {
		super();
		NumeroFactura = numeroFactura;
		MontoTotal = montoTotal;
		this.entradas = entradas;
		this.cliente = cliente;
		this.fecha = fecha;
	}
	
	public Venta() {
		NumeroFactura = 0;
		MontoTotal = 0;
		entradas = null;
		cliente = null;
		fecha = null;
	
	}
	public int getNumeroFactura() {
		return NumeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		NumeroFactura = numeroFactura;
	}
	public float getMontoTotal() {
		return MontoTotal;
	}
	public void setMontoTotal(float montoTotal) {
		MontoTotal = montoTotal;
	}
	
	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(MontoTotal);
		result = prime * result + NumeroFactura;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((entradas == null) ? 0 : entradas.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (Float.floatToIntBits(MontoTotal) != Float.floatToIntBits(other.MontoTotal))
			return false;
		if (NumeroFactura != other.NumeroFactura)
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (entradas == null) {
			if (other.entradas != null)
				return false;
		} else if (!entradas.equals(other.entradas))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venta [NumeroFactura=" + NumeroFactura + ", MontoTotal=" + MontoTotal + ", entradas=" + entradas
				+ ", cliente=" + cliente + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
