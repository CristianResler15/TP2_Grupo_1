package entidad;

public class Evento extends TipoEvento {
	
	//Atributos
	
	private int id;
	private String nombreEvento;
	private int cantEntradas;
	
	//Constructor por defecto
	
	public Evento() {
		this.setId(0);
		this.setNombreEvento("");
		this.setCantEntradas(0);
	
	}
	//Constructor con parametros

	public Evento(int id, String nombreEvento, TipoEvento tipo, int cantEntradas) {
		
		this.setId(id);
		this.setNombreEvento(nombreEvento);
		this.setCantEntradas(cantEntradas);
	
	}
	
	//Setters & Getters

	public int getId() {
		return id;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}


	public int getCantEntradas() {
		return cantEntradas;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	

	public void setCantEntradas(int cantEntradas) {
		this.cantEntradas = cantEntradas;
	}

	///ToString
	
	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombreEvento=" + nombreEvento + ", tipo=" + getTipoEvento() + ", cantEntradas="
				+ cantEntradas + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantEntradas;
		result = prime * result + id;
		result = prime * result + ((nombreEvento == null) ? 0 : nombreEvento.hashCode());
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
		Evento other = (Evento) obj;
		if (cantEntradas != other.cantEntradas)
			return false;
		if (id != other.id)
			return false;
		if (nombreEvento == null) {
			if (other.nombreEvento != null)
				return false;
		} else if (!nombreEvento.equals(other.nombreEvento))
			return false;
		return true;
	}

	@Override
	public String Descripcion() {
		String descripcion= "Este es un evento de "+getTipoEvento();
		return descripcion;
	}
	


	
}
