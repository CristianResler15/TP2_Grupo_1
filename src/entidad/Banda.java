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
	public String toString() {
		return "Banda [id=" + id + ", nombre=" + nombre + ", integrantes=" + integrantes + "]";
	}

	

}
