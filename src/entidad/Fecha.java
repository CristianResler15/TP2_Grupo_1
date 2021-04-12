package entidad;

public class Fecha {
	
	//Atributos
	private int dia;
    private int mes;
	private int a�o;

	//Constructor por defecto
    public Fecha() {
	    }

	//Constructor con par�metros
	public Fecha(int dia, int mes, int a�o) {
	        this.dia = dia;
	        this.mes = mes;
	        this.a�o = a�o;
	    }

	 //Setters & Getters
	 public void setDia(int d) {
	        dia = d;
	    }
	 public void setMes(int m) {
	        mes = m;
	    }
	 public void setA�o(int a) {
	        a�o = a;
	    }
	 public int getDia() {
	        return dia;
	    }
	 public int getMes() {
	        return mes;
	    }
	 public int getA�o() {
	        return a�o;
	    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a�o;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (a�o != other.a�o)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return dia + " - " + mes + " - " + a�o;
	}
	 
	 
}
