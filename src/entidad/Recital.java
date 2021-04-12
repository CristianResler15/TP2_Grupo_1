package entidad;

import java.util.ArrayList;

public class Recital extends Evento{
	
	//Atributos
	
	private int id;
	private Banda bandaPrincipal;
	private ArrayList<Banda> bandasInvitadas;
	private Genero genero;
		
	//Constructor por defecto
		
	public Recital() {
		this.setBandaPrincipal(null);
		this.setBandasInvitadas(null);
		this.setGenero(null);
		this.setId(0);
		
	}
	
	//Constructor con parametros

	public Recital(int id, Banda bandaPrincipal, ArrayList<Banda> bandasInvitadas, Genero genero) {
		super();
		this.id = id;
		this.bandaPrincipal = bandaPrincipal;
		this.bandasInvitadas = bandasInvitadas;
		this.genero = genero;
	}


// Metodos
	
	public float calcularValorEntrada(int tipo) {
		if(tipo == 1) {
			return 1500;
		} else {
			return 800;
		}
	}
	
	//Setters & Getters
	
	public int getId() {
		return id;
	}

	public Banda getBandaPrincipal() {
		return bandaPrincipal;
	}


	public Genero getGenero() {
		return genero;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBandaPrincipal(Banda bandaPrincipal) {
		this.bandaPrincipal = bandaPrincipal;
	}

	public ArrayList<Banda> getBandasInvitadas() {
		return bandasInvitadas;
	}

	public void setBandasInvitadas(ArrayList<Banda> bandasInvitadas) {
		this.bandasInvitadas = bandasInvitadas;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	

	//ToString

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bandaPrincipal == null) ? 0 : bandaPrincipal.hashCode());
		result = prime * result + ((bandasInvitadas == null) ? 0 : bandasInvitadas.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + id;
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
		Recital other = (Recital) obj;
		if (bandaPrincipal == null) {
			if (other.bandaPrincipal != null)
				return false;
		} else if (!bandaPrincipal.equals(other.bandaPrincipal))
			return false;
		if (bandasInvitadas == null) {
			if (other.bandasInvitadas != null)
				return false;
		} else if (!bandasInvitadas.equals(other.bandasInvitadas))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recital [id=" + id + ", bandaPrincipal=" + bandaPrincipal + ", bandaInvitada=" + bandasInvitadas
				+ ", genero=" + genero + "]";
	}

	
	
	

}
