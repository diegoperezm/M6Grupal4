package dao;

import java.util.List;

import modelo.Capacitacion;

interface ICapacitacionDao {
	public List<Capacitacion> obtenerCapacitaciones();
	public boolean crearCapacitacion(Capacitacion capacitacion);
}
