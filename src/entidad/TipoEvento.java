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
	
	
	public abstract String Descripcion() ;
	

}
