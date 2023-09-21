package ar.edu.unq.po2.tp2;
import java.util.Collection;
import java.util.ArrayList;

public class Empresa {
	private String cuit;
	private String nombre;
	private Collection<Empleado> empleados = new ArrayList<>();
	private Collection<ReciboDeHaberes> recibos = new ArrayList<>();

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
	
	public double sueldosNetosTotales() {

		return this.empleados.stream().mapToDouble(e -> e.sueldoNeto()).sum();
	}
	
	public double sueldosBrutosTotales() {
		
		return this.empleados.stream().mapToDouble(e -> e.sueldoBruto()).sum();		
	}
	
	public double retencionesTotales() {
		return this.empleados.stream().mapToDouble(e -> e.retenciones()).sum();			
	}
	
	public void liquidarSueldos() {
		this.empleados.stream().forEach(e -> this.generarRecibo(e));
	}
	
	public void mostrarRecibos() {
		this.recibos.stream().forEach(r->r.mostrar());
	}
	
	private void generarRecibo(Empleado empleado) {
		this.agregarRecibo(new ReciboDeHaberes(empleado));
	}
	
	private void agregarRecibo(ReciboDeHaberes recibo) {
		this.recibos.add(recibo);
	}
}
