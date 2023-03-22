package br.com.edu.exercicioedu.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edu.exercicioedu.Models.entities.Cliente;

@RestController
public class ClientController {
	@GetMapping(path = "/cliente")
	public Cliente obterClientes() {
		return new Cliente(1,"Eduardo","123.456.789.89");
	}
}
