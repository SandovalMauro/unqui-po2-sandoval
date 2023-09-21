package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado{
	private int nroContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,
			int sueldoBasico, int nroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		// TODO Auto-generated constructor stub
		this.nroContrato = nroContrato;
		this.medioDePago = medioDePago;
	}

	public int getNroContrato() {
		return nroContrato;
	}

	public void setNroContrato(int nroContrato) {
		this.nroContrato = nroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	private double gastosAdministrativos() {
		return 50;
	}

	@Override
	protected double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico();
	}

	@Override
	protected double retenciones() {
		// TODO Auto-generated method stub
		return this.gastosAdministrativos();
	}

	@Override
	protected double obraSocial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double aportesJubilatorios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getConceptos() {
		// TODO Auto-generated method stub
		return "Sueldo bruto: $" + this.sueldoBruto() + "\n" +
		"\tSueldo básico: $" + this.getSueldoBasico() + "\n" +
		"Retenciones: $" + this.retenciones() + "\n" +
		"\tGastos administrativos contractuales: $" + this.gastosAdministrativos();
	}

}
