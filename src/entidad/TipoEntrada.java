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
	public String toString() {
		return "Tipo de entrada: " + tipo;
	}
	
	
	

}
