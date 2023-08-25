package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final CursoRepository repositoryC;
	private final AlumnoRepository repositoryA;

	@Autowired
	public DatabaseLoader(CursoRepository repositoryI, AlumnoRepository repositoryA) {
		this.repositoryC = repositoryI;
		this.repositoryA = repositoryA;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repositoryC.save(new Curso("Algebra 1", "Matetamtica", "3 Creditos"));
		this.repositoryC.save(new Curso("Geometria Espacial","Matetamtica","4 Creditos"));
		this.repositoryC.save(new Curso("Literatura","Ciencia","1 Creditos"));
		this.repositoryC.save(new Curso("Historia Contemporanea","Ciencia","2 Creditos"));
		
		this.repositoryA.save(new Alumno("Deyvid Mallma"));
		this.repositoryA.save(new Alumno("Williams Huillca"));
	}
}