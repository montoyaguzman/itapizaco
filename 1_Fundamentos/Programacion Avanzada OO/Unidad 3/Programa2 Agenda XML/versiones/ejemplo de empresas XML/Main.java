package com.danielme.blog.castorxml.pruebas22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

import com.danielme.blog.castorxml.modeloequipo.Entrenador;
import com.danielme.blog.castorxml.modeloequipo.Equipo;
import com.danielme.blog.castorxml.modeloequipo.Jugador;

/**
 * Pruebas de marshalling/unmarshalling.
 * 
 * @author danielme.com
 * 
 */
public class Main
{

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		String fichero = "exportacionEquipo.xml";
		Equipo equipo = equipoDePrueba();
		try
		{
			FileWriter writer = new FileWriter(fichero);
			Marshaller.marshal(equipo, writer);
			FileReader fileReader = new FileReader(fichero);
			Equipo unmarshal = (Equipo) Unmarshaller.unmarshal(Equipo.class, fileReader);
			System.out.println("EQUIPO : " + unmarshal.getNombre());
			System.out.println("entrenador: " + unmarshal.getEntrenador().getNombre() + " "
					+ unmarshal.getEntrenador().getApellidos());
			System.out.println("jugadores  ");

			for (Jugador jugador : equipo.getJugadores())
			{
				System.out.println("            " + jugador.getDorsal() + ": " + jugador.getNombre() + " "
						+ jugador.getApellidos());
			}
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		catch (MarshalException e2)
		{
			e2.printStackTrace();
		}
		catch (ValidationException e3)
		{
			e3.printStackTrace();
		}

	}

	private static Equipo equipoDePrueba() {
		Equipo equipo = new Equipo();
		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Juan");
		jugador1.setApellidos("Español");
		jugador1.setDorsal(1);
		jugador1.setEstatura(178);
		jugador1.setPeso(74.3F);
		jugador1.setId(1);
		Calendar fechaNac1 = new GregorianCalendar(1987, 2, 10);
		jugador1.setFechaNacimiento(fechaNac1);

		Jugador jugador2 = new Jugador();
		jugador2.setNombre("Miguel");
		jugador2.setApellidos("Pérez Pérez");
		jugador2.setDorsal(2);
		jugador2.setEstatura(174);
		jugador2.setPeso(71.1F);
		jugador2.setId(2);
		Calendar fechaNac2 = new GregorianCalendar(1985, 3, 7);
		jugador2.setFechaNacimiento(fechaNac2);

		Entrenador entrenador = new Entrenador();
		entrenador.setEquipo(equipo);
		entrenador.setId(14);
		entrenador.setNombre("Joaquín");
		entrenador.setApellidos("García");
		Calendar fechaNac3 = new GregorianCalendar(1964, 1, 2);
		entrenador.setFechaNacimiento(fechaNac3);

		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);

		equipo.setId(1);
		equipo.setNombre("JAVA TEAM");
		equipo.setEntrenador(entrenador);
		equipo.setJugadores(jugadores);

		return equipo;
	}

}