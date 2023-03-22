package br.com.edu.exercicioedu.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = "/")
	public String ola() {
		return "olá Eduardo";
	}
}
