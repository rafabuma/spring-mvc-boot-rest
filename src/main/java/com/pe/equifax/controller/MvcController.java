package com.pe.equifax.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;

import com.example.demo.clientRC.ClienteXml;
import com.pe.equifax.bean.Cliente;

@Controller
@SessionAttributes("name")
public class MvcController {
	
	//@GetMapping("/")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		System.out.println("Si llega ...");
		return "index";
	}
	
	  @RequestMapping(value = "/home")	  
	  public String home(@ModelAttribute Cliente clienteBean, Model model, @RequestParam String name) {
		  System.out.println("inicio de la llamda");
	    List<ClienteXml> lista = null;
	    try {
	    	RestTemplate restTemplate =new RestTemplate();
			List<ClienteXml> listCliente=restTemplate.getForObject("http://localhost:8080/allClientes", List.class);
			lista = listCliente;//clienteService.listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    model.addAttribute("name", name);
	    model.addAttribute("lista", lista);
	    System.out.print("clientes: "+lista.size());
	    System.out.println("fin de la llamda");
	    return "home";
	  }
	
	@PostMapping("/hello")
	public String sayHello(@RequestParam ("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
		
		
	}
	

	@RequestMapping("/addCliente")
	public String add() {
		
	
		return "addCliente";
		
		
	}

}
