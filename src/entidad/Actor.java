package entidad;

public class Actor {
	
	private String nombre;
	
	
	public Actor() {
		
		this.nombre = "";
	}

	// constructor con parametros
	public Actor(String nombre) {
		
	}

	// getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + "]";
	}
}
