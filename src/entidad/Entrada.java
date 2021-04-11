package entidad;

public class Entrada {
	
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
	public String toString() {
		return "Entrada [id= " + id + " evento = " + evento + " [duracion = " + duracion + "] [fecha = " + fecha + "] [horario = "
				+ horario + "] [precio = " + precio + "] [tipo = " + tipo + "]";
	}
	
	
	
	

}
