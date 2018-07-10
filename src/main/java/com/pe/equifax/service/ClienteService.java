package com.pe.equifax.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pe.equifax.bean.Cliente;


@Service
public interface ClienteService {
	
	
	public void registrar(Cliente cliente) throws Exception ;
	public void actualizar(Cliente cliente) throws Exception ;
	public void eliminar(Cliente cliente) throws Exception ;
	public List<Cliente> listar() throws Exception ;
}
