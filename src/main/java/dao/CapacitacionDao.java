package dao;

import java.util.List;
import java.util.ArrayList;

import modelo.Capacitacion;

/*
 * nota: el ejercicio solicita:
 * 
 * 5. “obtenerCapacitaciones”: no recibirá parámetros, y 
 * retornará una lista de capacitaciones, 
 *  
 * 6.Para el caso del método “obtenerCapacitaciones”, 
 *  debe desplegar un listado de elementos (al menos tres); 
 */
	
public class CapacitacionDao implements ICapacitacionDao {

	@Override
	public  List<Capacitacion> obtenerCapacitaciones() {
		List<Capacitacion> lista = new ArrayList<Capacitacion>();
		Capacitacion capacitacion1 = new Capacitacion();
		Capacitacion capacitacion2 = new Capacitacion();
		Capacitacion capacitacion3 = new Capacitacion();

	    capacitacion1.setId(1);
		capacitacion1.setNombre("Alfredo");
		capacitacion1.setDetalle("Una capacitacion 1");

		capacitacion2.setId(2);
		capacitacion2.setNombre("Baldomero");
		capacitacion2.setDetalle("Una capacitacion 2");

		capacitacion3.setId(3);
		capacitacion3.setNombre("Carlos");
		capacitacion3.setDetalle("Una capacitacion 3");

		lista.add(capacitacion1);
		lista.add(capacitacion2);
		lista.add(capacitacion3);

		return lista;
	}

	@Override
	public boolean crearCapacitacion(Capacitacion capacitacion) {
		return false;
	}

}
