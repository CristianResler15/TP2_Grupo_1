package entidad;

public class Entrada implements Comparable<Entrada>{
	
	//Atributos
	
		private int id;
		private Evento evento;
		private String duracion;
		private Fecha fecha;
		private String horario;
		private float precio;
		private TipoEntrada tipo;
	
	//Constructor por defecto
		
	public Entrada() {
		this.setEvento(null);
		this.setFecha(null);
		this.setDuracion("");
		this.setHorario("");
		this.setPrecio(0);
		this.setTipo(null);
		this.setId(0);
		
	}
	//Constructor con parametros

	public Entrada(int id, Evento evento, String duracion, Fecha fecha, String horario, float precio, TipoEntrada tipo) {
		this.setEvento(evento);
		this.setFecha(fecha);
		this.setDuracion(duracion);
		this.setHorario(horario);
		this.setPrecio(precio);
		this.setTipo(tipo);
		this.setId(id);
	
	}
	
	//Setters & Getters

	public int getId() {
		return id;
	}

	public Evento getEvento() {
		return evento;
	}

	public String getDuracion() {
		return duracion;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public String getHorario() {
		return horario;
	}

	public float getPrecio() {
		return precio;
	}

	public TipoEntrada getTipo() {
		return tipo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setTipo(TipoEntrada tipo) {
		this.tipo = tipo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duracion == null) ? 0 : duracion.hashCode());
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(precio);
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Entrada other = (Entrada) obj;
		if (duracion == null) {
			if (other.duracion != null)
				return false;
		} else if (!duracion.equals(other.duracion))
			return false;
		if (evento == null) {
			if (other.evento != null)
				return false;
		} else if (!evento.equals(other.evento))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entrada [id= " + id + " evento = " + evento + " [duracion = " + duracion + "] [fecha = " + fecha + "] [horario = "
				+ horario + "] [precio = " + precio + "] [tipo = " + tipo + "]";
	}

	@Override
	public int compareTo(Entrada e) {
		if(e.id == id) {
		return 0;
		} else {
			return 1;
		}
	}
	
	
	
	

}
