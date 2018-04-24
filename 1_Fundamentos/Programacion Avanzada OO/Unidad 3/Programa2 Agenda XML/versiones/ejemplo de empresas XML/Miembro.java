package com.danielme.blog.castorxml.modeloequipo;

import java.util.Calendar;

/**
 * Clases de ejemplo.
 * 
 * @author http://danielme.com
 * 
 */
public abstract class Miembro 
{
	
	private Integer id;
	
	private Equipo equipo;
	
	private String nombre;
	
	private String apellidos;
	
	private Calendar fechaNacimiento;
	
	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



}
