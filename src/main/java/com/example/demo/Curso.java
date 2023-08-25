package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Curso {

	private @Id @GeneratedValue Long id;
	private String nombre;
	private String materia;
	private String descripcion;

	private Curso() {}

	public Curso(String nombre, String materia, String descripcion) {
		this.nombre = nombre;
		this.materia = materia;
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Curso curso = (Curso) o;
		return Objects.equals(id, curso.id) &&
			Objects.equals(nombre, curso.nombre) &&
			Objects.equals(materia, curso.materia) &&
			Objects.equals(descripcion, curso.descripcion);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, nombre, materia, descripcion);
	}


	@Override
	public String toString() {
		return "Curso{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", categoria='" + materia + '\'' +
			", descripcion='" + descripcion + '\'' +
			'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}}

	