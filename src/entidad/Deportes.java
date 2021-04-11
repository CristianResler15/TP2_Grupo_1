package entidad;

public class Deportes extends Evento{
	
	//Atributos
	
		private int idDeporte;
		private TipoDeporte tipoDeporte;
		private Nacionalidad nacionalidad;

	//Constructor por defecto

	public Deportes() {
		super();
		this.setNacionalidad(null);
		this.setTipo(null);
		this.setId(0);
	
	}
	//Constructor con parametros

		public Deportes(TipoDeporte tipoDeporte, Nacionalidad nacionalidad, int idDeporte) {
			super();
			this.setNacionalidad(nacionalidad);
			this.setTipo(tipoDeporte);
			this.setId(idDeporte);
		
		}
		
	public float CalcularPrecioDeporte(Deportes deporte) {
			
		    double precioFutbol = 300;
			double precioRugby = 450;
			double precioHockey = 380;
			double precioFinal = 0;
			double porcentajeRecargoInternacional = 1.30;
			
			switch(deporte.getTipo().getNombre()){
			case "Futbol":{
				precioFinal = precioFutbol;
				break;
				
			}
			case "Rugby":{
				precioFinal = precioRugby;
				break;
			}
			case "Hockey":{
				precioFinal = precioHockey;
				break;
			}
			
			default : {
				System.out.println("Deporte incorrecto.");
				break;
			}
			
			
		
			}
			
			if(deporte.getNacionalidad().getNombre()!="Nacional"){
				precioFinal = precioFinal * porcentajeRecargoInternacional;
			}
			
			return (float) precioFinal;
			
			
		} 
	
	//Setters & Getters

	public int getId() {
		return idDeporte;
	}

	public TipoDeporte getTipo() {
		return tipoDeporte;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setId(int id) {
		this.idDeporte = id;
	}

	public void setTipo(TipoDeporte tipo) {
		this.tipoDeporte = tipo;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	//ToString

	@Override
	public String toString() {
		return "Deportes [id = " + idDeporte + " tipo = " + tipoDeporte + "nacionalidad = " + nacionalidad + "]";
		
	}

	

}
