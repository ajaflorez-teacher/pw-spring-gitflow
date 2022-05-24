package pe.edu.upc.juantorres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ejemplo") // el request es el nombre del link, en este caso sera /ejemplo
public class ExampleController {
	
	@GetMapping //esto significa que el metodo que sigue va tener el get request, osea el nombre del link
	public String ejemplo() {
		return "example"; //aqui va el nombre que puse en el templates html
	}
}