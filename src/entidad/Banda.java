package entidad;


public class Banda  {
	
	//Atributos
	
	private int id;
	private String nombre;
	private String integrantes;

    //Constructor por defecto

	public Banda() {
		
		this.setIntegrantes("");
		this.setNombre("");
		this.setId(0);
	
	}
	
	// Constructor con parametros
	public Banda(int id, String nombre, String integrantes)
	{
		this.setIntegrantes(integrantes);
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

	public String getIntegrantes() {
		return integrantes;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	
	//ToString
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((integrantes == null) ? 0 : integrantes.hashCode());
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
		Banda other = (Banda) obj;
		if (id != other.id)
			return false;
		if (integrantes == null) {
			if (other.integrantes != null)
				return false;
		} else if (!integrantes.equals(other.integrantes))
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
		return "Banda [id=" + id + ", nombre=" + nombre + ", integrantes=" + integrantes + "]";
	}

	

}
