package com.pe.equifax.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pe.equifax.bean.Cliente;
import com.pe.equifax.dao.ClienteDao;

@Repository
public class ClienteDaoImpl implements ClienteDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void registrar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() throws Exception{
		
		String sql="select idCliente, nombre, apellido,email, direccion from cliente";
		
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
	}

}
