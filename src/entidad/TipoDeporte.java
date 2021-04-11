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
	public String toString() {
		return nombre + " descripcion= " + descripcion + " ";
	}
	
	

}
