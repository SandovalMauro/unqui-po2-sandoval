package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	int cantidadHijos;
	int AniosAntiguedad;
	boolean tieneConyuge;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, int sueldoBasico,int cantidadHijos, int antiguedad, boolean tieneConyuge) {
		super(nombre,direccion,estadoCivil,fechaNac,sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.AniosAntiguedad = antiguedad;
		this.tieneConyuge = tieneConyuge;
	}
	
	@Override
	protected double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.salarioFamiliar();
	}

	@Override
	protected double retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial() + this.aportesJubilatorios();
	}

	@Override
	protected double obraSocial() {
		// TODO Auto-generated method stub
		return (this.sueldoBruto() * 0.1) + (this.cantidadHijos * 20);
	}

	@Override
	protected double aportesJubilatorios() {
		// TODO Auto-generated method stub
		return this.sueldoBruto() * 0.15;
	}

	@Override
	public String getConceptos() {
		// TODO Auto-generated method stub
		return "Sueldo bruto: $" + this.sueldoBruto() + "\n" +
				"\tSueldo básico: $" + this.getSueldoBasico() + "\n" +
				"\tSalario familiar: $" + this.salarioFamiliar() + "\n" + 
				"Retenciones: $" + this.retenciones() + "\n" +
				"\tObra social: $" + this.obraSocial() + "\n" + 
				"\tJubilación: $" + this.aportesJubilatorios();
	}
	
	private double salarioFamiliar() {
		return this.asignacionPorHijo() + this.asignacionPorConyuge() + this.valorPorAntiguedad();
	}
	
	private double asignacionPorHijo() {
		return this.cantidadHijos * 150;
	}
	
	private double asignacionPorConyuge() {
		int valor = 0;
		if(this.tieneConyuge) {valor =100;} 
		return valor;
	}
	
	private double valorPorAntiguedad() {
		return this.AniosAntiguedad * 50;
	}
}
