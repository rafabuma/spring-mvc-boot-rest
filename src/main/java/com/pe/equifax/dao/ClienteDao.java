package com.pe.equifax.dao;

import java.util.List;

import com.pe.equifax.bean.Cliente;



public interface ClienteDao {
	
	public void registrar(Cliente cliente) throws Exception ;
	public void actualizar(Cliente cliente) throws Exception ;
	public void eliminar(Cliente cliente) throws Exception ;
	public List<Cliente> listar() throws Exception ;

}
