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
	public String toString() {
		return " " + nombre;
	}
	
	

}
