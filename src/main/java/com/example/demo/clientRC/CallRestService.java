package com.example.demo.clientRC;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class CallRestService {
	
	public static void main(String[] args){
		
		RestTemplate restTemplate =new RestTemplate();
		List<ClienteXml> listCliente=restTemplate.getForObject("http://localhost:8080/allClientes", List.class);
		System.out.println("listCliente: "+listCliente);
	}

}
