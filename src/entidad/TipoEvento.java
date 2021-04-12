package entidad;

public abstract class TipoEvento {
	
	//Atributos
	
		private int id;
		private String tipoEvento;

	//Constructor poor defecto
		
	public TipoEvento() {
		this.setTipoEvento("");
		this.setId(0);
	}
	
	//Constructor con parametros

	public TipoEvento(int id, String tipoEvento) {
		
		this.setTipoEvento(tipoEvento);
		this.setId(id);
	
	}
	//Setters & Getters 
	
	public int getId() {
		return id;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "TipoEvento [id=" + id + ", tipoEvento=" + tipoEvento + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((tipoEvento == null) ? 0 : tipoEvento.hashCode());
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
		TipoEvento other = (TipoEvento) obj;
		if (id != other.id)
			return false;
		if (tipoEvento == null) {
			if (other.tipoEvento != null)
				return false;
		} else if (!tipoEvento.equals(other.tipoEvento))
			return false;
		return true;
	}

	public abstract String Descripcion() ;
	

}
