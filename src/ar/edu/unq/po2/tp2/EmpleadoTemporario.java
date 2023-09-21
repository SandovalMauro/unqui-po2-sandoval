package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado{
	LocalDate finDesignacion;
	int hsExtras;

	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,
			int sueldoBasico, LocalDate finDesignacion, int hsExtras) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		// TODO Auto-generated constructor stub
		this.finDesignacion = finDesignacion;
		this.hsExtras = hsExtras;
	}

	@Override
	protected double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.valorPorHsExtras(40);
	}

	@Override
	protected double retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial() + this.aportesJubilatorios();
	}

	@Override
	protected double obraSocial() {
		// TODO Auto-generated method stub
		return (this.sueldoBruto() * 0.1) + this.agregadoAObraSocialPorEdad();
	}

	private double agregadoAObraSocialPorEdad() {
		// TODO Auto-generated method stub
		int valorAgregado = 0;
		if(this.edad()>50) {valorAgregado=25;}
		return valorAgregado;
	}

	@Override
	protected double aportesJubilatorios() {
		// TODO Auto-generated method stub
		return (this.sueldoBruto() * 0.1) + this.valorPorHsExtras(5);
	}

	@Override
	public String getConceptos() {
		// TODO Auto-generated method stub
		return "Sueldo bruto: $" + this.sueldoBruto() + "\n" +
				"\tSueldo básico: $" + this.getSueldoBasico() + "\n" +
				"\tHoras extras: $" + this.valorPorHsExtras(40) + "\n" + 
				"Retenciones: $" + this.retenciones() + "\n" +
				"\tObra social: $" + this.obraSocial() + "\n" + 
				"\tJubilación: $" + this.aportesJubilatorios();
	}
	
	private double valorPorHsExtras(int valor) {
		return this.hsExtras * valor;
	}
}
