package entidad;

import java.util.ArrayList;

public class Teatro extends Evento{
	
	//Atributos
	
	private int id;
	private Genero genero;
	private ArrayList<Actor> actores;
	public final static double valorEntrada = 1350.5;
	
	//Constructor por defecto

	public Teatro() {

		this.setActor(null);
		this.setGenero(null);
		this.setId(0);
		
	}
	
	//Constructor con parametros

	public Teatro(int id, Genero genero, ArrayList<Actor> actores) {
		
		this.setActor(actores);
		this.setGenero(genero);
		this.setId(id);
	
	}
	//Setters & Getters
	
	public int getId() {
		return id;
	}

	public Genero getGenero() {
		return genero;
	}

	public ArrayList<Actor> getActor() {
		return actores;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setActor(ArrayList<Actor> actores) {
		this.actores = actores;
	
	}
	
	
	//ToString

	@Override
	public String toString() {
		return "Teatro [id=" + id + ", genero=" + genero + ", actores=" + actores + "]";
	}



	
	

}
