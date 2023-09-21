package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	private Empleado empleado;
	private LocalDate fechaEmision;
	private double sueldoNeto;
	private String desgloseConceptos;
	
	public ReciboDeHaberes(Empleado empleado) {
		this.empleado = empleado;
		this.fechaEmision = LocalDate.now();
		this.sueldoNeto = empleado.sueldoNeto();
		this.desgloseConceptos = empleado.getConceptos();
	}
	
	public void mostrar() {
		this.mostrarEmpleado();
		this.mostrarFecha();
		this.mostrarConceptos();
		this.mostrarSueldoNeto();
	}
	
	
	private void mostrarFecha() {
		System.out.println("Fecha emisión: " + this.fechaEmision + "\n");
	}
	
	private void mostrarEmpleado() {
		System.out.println("Nombre : " + this.empleado.getNombre() + "\n" +
							"Dirección: " + this.empleado.getDireccion());
	}
	
	private void mostrarConceptos() {
		System.out.println(this.desgloseConceptos);
	}
	
	private void mostrarSueldoNeto() {
		System.out.println("\nSueldo neto: $" + this.sueldoNeto);
	}
}
