package ar.edu.unq.po2.practica;

public class Plato implements Comparable<Plato>{
	private String nombre;
	private int precio;
	
	public Plato(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public double precioConIvaPlato() {
		return precio * 1.21;
	}

	@Override
	public int compareTo(Plato o) {
		// TODO Auto-generated method stub
		int valor = 0;
		if(this.precio > o.getPrecio()) {
			valor++;
		}
		else if(this.precio < o.getPrecio()) {
			valor--;
		}
		
		return valor;
		
	}
}
