package entidad;

public class Fecha {
	
	//Atributos
	private int dia;
    private int mes;
	private int año;

	//Constructor por defecto
    public Fecha() {
	    }

	//Constructor con parámetros
	public Fecha(int dia, int mes, int año) {
	        this.dia = dia;
	        this.mes = mes;
	        this.año = año;
	    }

	 //Setters & Getters
	 public void setDia(int d) {
	        dia = d;
	    }
	 public void setMes(int m) {
	        mes = m;
	    }
	 public void setAño(int a) {
	        año = a;
	    }
	 public int getDia() {
	        return dia;
	    }
	 public int getMes() {
	        return mes;
	    }
	 public int getAño() {
	        return año;
	    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
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
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return dia + " - " + mes + " - " + año;
	}
	 
	 
}
