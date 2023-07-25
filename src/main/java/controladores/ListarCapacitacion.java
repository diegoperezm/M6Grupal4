package controladores;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CapacitacionDao;
import modelo.Capacitacion;

@Controller
public class ListarCapacitacion {
	@GetMapping("/listarcapacitacion")
	public String listarCapacitacionControlador(
			@RequestParam(name="lista", required=false) String  lista,
			Model model) {
		List<Capacitacion> listaC = new ArrayList<Capacitacion>();
		CapacitacionDao c = new CapacitacionDao();
		listaC = c.obtenerCapacitaciones();
		model.addAttribute("lista", listaC);
		return "listarcapacitacion";
	}

}
