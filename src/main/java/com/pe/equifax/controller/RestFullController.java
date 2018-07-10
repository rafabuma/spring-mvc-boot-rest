package com.pe.equifax.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.clientRC.ClienteXml;
import com.pe.equifax.bean.Cliente;

@RestController
public class RestFullController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	private ClienteService clienteService;
	

	  

	@RequestMapping(value="/createTable", method=RequestMethod.GET)
	public void createTable(){
		try {
			jdbcTemplate.execute(" create table cliente (idCliente Serial, nombre varchar(50) , "
					+ " apellido varchar(50),email varchar(50), direccion varchar(100) )");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/putData", method=RequestMethod.GET)
	public void putDate(){
		try {
			jdbcTemplate.execute(" insert into cliente (idCliente,nombre,apellido,email,direccion) values "
					+ "(2,'claudia','cusco','@ccusco','lima') ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/allClientes", method=RequestMethod.GET, produces="application/json" )
	public List<Cliente> list() throws Exception{

		String sql="select idCliente, nombre, apellido,email, direccion from cliente  ";
		
		List<Cliente> listCliente=new ArrayList<Cliente>();
		
		List<Map<String, Object>> clientRows=jdbcTemplate.queryForList(sql);
		
		for(Map<String, Object> clientRow:clientRows) {
			
			Cliente cliente=new Cliente();
			
			cliente.setIdCliente(Integer.parseInt(String.valueOf(clientRow.get("idCliente"))));
			cliente.setNombre(String.valueOf(clientRow.get("nombre") ));
			cliente.setApellido(String.valueOf(clientRow.get("apellido") ));
			cliente.setEmail(String.valueOf(clientRow.get("email") ));
			cliente.setDireccion(String.valueOf(clientRow.get("direccion") ));
			
			listCliente.add(cliente);
		}

	return listCliente;	
//		return clienteService.listar();
	}
}
