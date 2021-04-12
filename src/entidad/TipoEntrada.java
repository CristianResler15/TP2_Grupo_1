package entidad;

public class TipoEntrada {
	
	//Atributos
	
	private int id;
	private String tipo;
	
	//Constructor por defecto

	public TipoEntrada() {
		this.setTipoEntrada("");
		this.setId(0);
	}
	
	//Constructor con parametros

	public TipoEntrada(int id, String tipo) {
		
		this.setTipoEntrada(tipo);
		this.setId(id);
	
	}
	
	//Setters & Getters
	
	public int getId() {
		return id;
	}

	public String getTipoEntrada() {
		return tipo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTipoEntrada(String tipo) {
		this.tipo = tipo;
	}

	//ToString
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		TipoEntrada other = (TipoEntrada) obj;
		if (id != other.id)
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
		return "Tipo de entrada: " + tipo;
	}
	
	
	

}
