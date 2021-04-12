package entidad;

public class Nacionalidad {
	
	//Atributos
	
		private int id;
		private String nombre;
		
	//Constructor por defecto

	public Nacionalidad() {
		this.setNombre("");
		this.setId(0);
		
	}
	
	//Constructor con parametros

	public Nacionalidad(int id, String nombre, String descripcion) {
		
		this.setNombre(nombre);
		this.setId(id);
	
	}
	
	//Setters & Getters

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//ToString

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Nacionalidad other = (Nacionalidad) obj;
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
		return " " + nombre;
	}
	
	

}
