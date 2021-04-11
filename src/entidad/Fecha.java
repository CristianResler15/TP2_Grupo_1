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
	public String toString() {
		return dia + " - " + mes + " - " + año;
	}
	 
	 
}
