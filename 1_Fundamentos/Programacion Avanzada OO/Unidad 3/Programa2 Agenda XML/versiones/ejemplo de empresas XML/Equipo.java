package com.danielme.blog.castorxml.modeloequipo;

import java.util.List;

/**
 * Clases de ejemplo.
 * 
 * @author http://danielme.com
 * 
 */
public class Equipo {

	private Integer id;

	private String nombre;

	private List<Jugador> jugadores;

	private Entrenador entrenador;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

}
