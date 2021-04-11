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
	public String toString() {
		return dia + " - " + mes + " - " + a�o;
	}
	 
	 
}
