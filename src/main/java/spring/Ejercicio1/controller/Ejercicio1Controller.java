package spring.Ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class Ejercicio1Controller {

	@GetMapping("")
	public String saludoHolaMundo() {
		return "index.html";
	}	
	
	@GetMapping("/que")
	public String saludoHolaMundo2() {
		return "que.html";
	}
	
	@GetMapping("/contacto")
	public String despedida() {
		return "contacto.html";
	}
	
}
