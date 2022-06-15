package com.spring.app.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.app.dao.EmpresaDAO;
import com.spring.app.model.Empresa;

@Path("empresaRecurso")
public class EmpresaResource {
	
	@Autowired
	private EmpresaDAO dao;
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/save")
	public Empresa saveEmpresa(Empresa empresa) {
		return dao.save(empresa);
	}
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getEmpresas")
	public List<Empresa> getEmpresas(){
		return dao.findAll();
	}
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getEmpresas/{name}")
	public Empresa getEmpresaByName(@PathParam("name") String name) {
		return dao.findByName(name);
	}

}
