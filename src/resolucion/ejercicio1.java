package resolucion;
import java.util.ArrayList;

import entidad.Actor;
import entidad.Banda;
import entidad.Deportes;
import entidad.Entrada;
import entidad.Fecha;
import entidad.Genero;
import entidad.Infantil;
import entidad.Nacionalidad;
import entidad.Recital;
import entidad.Teatro;
import entidad.TipoDeporte;
import entidad.TipoEntrada;;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final float PrecioVip=1500;
		final float PrecioEstandar=800;
		ArrayList<Entrada> arrayEntrada = new ArrayList<Entrada>();
		
		TipoEntrada teGeneral = new TipoEntrada(1, "General");
		TipoEntrada teVip = new TipoEntrada(2, "Vip");
		TipoEntrada teMenor = new TipoEntrada(3, "Menor de 8 a?os");
		TipoEntrada teMayor = new TipoEntrada(4, "Mayor de 8 a?os");
		

		Nacionalidad nacion = new Nacionalidad(1, "Nacional", "Argentina");
		TipoDeporte tipoDeporte = new TipoDeporte(7, "Rugby", "Deporte de equipo");
		Fecha date = new Fecha(06,04, 2021);
		
		Banda bandaPrincipal= new Banda(1,"Divididos","Raul,Ricardo");
		Banda bandaInvitada1 = new Banda(2,"La vela puerca","Sebastian, Rafael, Nicolas, Carlos, Santiago");
		Banda bandaInvitada2 = new Banda(3,"La renga","Chizzo, Chiflo, Raul, Jorge");
		ArrayList<Banda> bandasInvitadas= new ArrayList<Banda>();
		bandasInvitadas.add(bandaInvitada1);
		bandasInvitadas.add(bandaInvitada2);
		
		Genero generoRecital= new Genero(1,"ROCK","Rock Progresivo");
		Genero generoTeatro = new Genero(2, "Comedia", "Stand Up");
		
		Actor Sebastian = new Actor("Sebastian Presta");
		Actor Mike = new Actor("Mike Chouhy");
		Actor Nicolas = new Actor("Nicolas de Tracy");
		
		ArrayList<Actor> actores = new ArrayList<Actor>();
		actores.add(Mike);
		actores.add(Sebastian);
		actores.add(Nicolas);
		
		float PrecioDeporte = 0;
		
		Deportes deporte = new Deportes(tipoDeporte, nacion, 2);
		PrecioDeporte = deporte.CalcularPrecioDeporte(deporte);
		Recital recital = new Recital(1, bandaPrincipal, bandasInvitadas, generoRecital);
		Infantil infantil = new Infantil(1, "Peluches");
		Teatro teatro = new Teatro(1, generoTeatro, actores);
		
		
		
		//Entradas
	
		Entrada entradaDeportes = new Entrada(1, deporte, "2 hs", date, "12 am", PrecioDeporte, teGeneral);
		Entrada entradaRecital = new Entrada(2, recital, "1,5 Hs", date, "11 pm", PrecioVip, teVip);
		Entrada entradaInfantil1 = new Entrada(3, infantil, "1 Hs", date, "8 am", infantil.calcularValorEntrada(1), teMenor);
		Entrada entradaInfantil2 = new Entrada(4, infantil, "2 Hs", date, "12 am", infantil.calcularValorEntrada(1), teMenor);
		Entrada entradaTeatro = new Entrada(5, teatro, "3 Hs", date, "11:30 pm", (float)teatro.valorEntrada, teGeneral);
		
		
		//Se agregan las entradas en el array
		arrayEntrada.add(entradaDeportes);
		arrayEntrada.add(entradaRecital);
		arrayEntrada.add(entradaInfantil1);
		arrayEntrada.add(entradaInfantil2);
		arrayEntrada.add(entradaTeatro);
		
		for (Entrada entrada : arrayEntrada) {
			System.out.println(entrada);
		}
		
	}

}
