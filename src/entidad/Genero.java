package entidad;

public class Genero {
	
	//Atributos
	
	private int id;
	private String nombre;
	private String descripcion;
			
	//Constructor por defecto
			
	public Genero() {
		this.setNombre("");
		this.setDescripcion("");
		this.setId(0);
		
	}
	//Constructor con parametros

	public Genero(int id,String nombre, String descripcion){
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
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
	public String toString() {
		return "Genero [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	

}
