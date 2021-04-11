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
	public String toString() {
		return "Recital [id=" + id + ", bandaPrincipal=" + bandaPrincipal + ", bandaInvitada=" + bandasInvitadas
				+ ", genero=" + genero + "]";
	}

	
	
	

}
