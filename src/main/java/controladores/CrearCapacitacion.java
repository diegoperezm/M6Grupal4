package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrearCapacitacion {
	@GetMapping("/crearcapacitacion")
	public String crearCapacitacionControlador() {
		return "crearcapacitacion";
	}
}
