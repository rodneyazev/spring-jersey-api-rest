package com.spring.app;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.app.dao.EmpresaDAO;
import com.spring.app.model.Empresa;

@SpringBootApplication
public class SpringJerseyApplication {
	
	@Autowired
	private EmpresaDAO dao;
	
	@PostConstruct
	public void initDB() {
		dao.saveAll(Stream.of(new Empresa(890,"Rodney","Dev Team"), new Empresa(680, "Azevedo", "QA")).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJerseyApplication.class, args);
	}

}
