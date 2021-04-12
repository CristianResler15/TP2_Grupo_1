package entidad;

public class TipoDeporte {
	
	//Atributos
	
		private int id;
		private String nombre;
		private String descripcion;

	//Constructor por defecto

	public TipoDeporte() {
		this.setNombre("");
		this.setDescripcion("");
		this.setId(0);
	}
	
	//Constructor con parametros

	public TipoDeporte(int id, String nombre, String desc) {
		
		this.setNombre(nombre);
		this.setDescripcion(desc);
		this.setId(id);
	
	}

	//Setters & Getters
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//ToString

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		TipoDeporte other = (TipoDeporte) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre + " descripcion= " + descripcion + " ";
	}
	
	

}
