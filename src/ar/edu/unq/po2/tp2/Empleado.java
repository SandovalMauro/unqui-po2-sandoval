package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNac;
	private double sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public int edad(){
		int edad = LocalDate.now().getYear() - this.fechaNac.getYear();
		if(this.fechaNac.getDayOfYear()> LocalDate.now().getDayOfYear()) {edad--;}
		return edad;
	}
	
	public double sueldoNeto(){
		return this.sueldoBruto() - this.retenciones();
	}
	
	protected abstract double sueldoBruto();
	
	protected abstract double retenciones();
	
	protected abstract double obraSocial();
	
	protected abstract double aportesJubilatorios();

	public abstract String getConceptos() ;
	
}
