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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((actores == null) ? 0 : actores.hashCode());
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
		Teatro other = (Teatro) obj;
		if (actores == null) {
			if (other.actores != null)
				return false;
		} else if (!actores.equals(other.actores))
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
		return "Teatro [id=" + id + ", genero=" + genero + ", actores=" + actores + "]";
	}



	
	

}
