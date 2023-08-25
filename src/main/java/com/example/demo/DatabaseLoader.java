package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final CursoRepository repositoryC;
	private final MusicoRepository repositoryM;

	@Autowired
	public DatabaseLoader(CursoRepository repositoryI, MusicoRepository repositoryM) {
		this.repositoryC = repositoryI;
		this.repositoryM = repositoryM;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repositoryC.save(new Curso("Algebra 1", "Matetamtica", "3 Creditos"));
		this.repositoryC.save(new Curso("Geometria Espacial","Matetamtica","4 Creditos"));
		this.repositoryC.save(new Curso("Literatura","Ciencia","1 Creditos"));
		this.repositoryC.save(new Curso("Historia Contemporanea","Ciencia","2 Creditos"));
		this.repositoryM.save(new Musico("Daniel F"));
	}
}