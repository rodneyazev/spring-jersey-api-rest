package com.spring.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.spring.app.model.Empresa;

@Service
public interface EmpresaDAO extends JpaRepository<Empresa, Integer> {

	Empresa findByName(String name);

}
