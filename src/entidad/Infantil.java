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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id;
		result = prime * result + ((souvenir == null) ? 0 : souvenir.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infantil other = (Infantil) obj;
		if (id != other.id)
			return false;
		if (souvenir == null) {
			if (other.souvenir != null)
				return false;
		} else if (!souvenir.equals(other.souvenir))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Infantil [id=" + id + ", souvenir=" + souvenir +"]";
	}

	





}
