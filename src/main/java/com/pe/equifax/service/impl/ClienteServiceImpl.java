package com.pe.equifax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pe.equifax.bean.Cliente;
import com.pe.equifax.dao.ClienteDao;
import com.pe.equifax.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{
	
	
	@Autowired
	private ClienteDao clienteDao;

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
	public List<Cliente> listar() throws Exception {
		// TODO Auto-generated method stub
		return clienteDao.listar();
	}

}
