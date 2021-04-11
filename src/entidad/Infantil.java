package entidad;

public class Infantil extends Evento{
	
	//Atributos
	
	private int id;
	private String souvenir;

    //Constructor por defecto

	public Infantil() {
		this.setSouvenir("");
		this.setId(0);
		
	}
	//Constructor con parametros

	public Infantil(int id, String souvenir) {
		
		this.setSouvenir(souvenir);
		this.setId(id);
	
	}
	
	public float calcularValorEntrada(int opc) {
		if(opc == 1) {
			return 250;
		} else {
			return 500;
		}
	}
	
	//Setters & Getters
	
	public int getId() {
		return id;
	}

	public String getSouvenir() {
		return souvenir;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSouvenir(String souvenir) {
		this.souvenir = souvenir;
	}
	
	
	//ToString

	@Override
	public String toString() {
		return "Infantil [id=" + id + ", souvenir=" + souvenir +"]";
	}

	





}
