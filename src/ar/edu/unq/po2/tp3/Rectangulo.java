package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point puntoSupIzq;
	//private Point puntoInfDer;
	private int alto;
	private int ancho;
	
	public Rectangulo(Point verticeSupIzq, int altura, int anchura) {
		this.puntoSupIzq = verticeSupIzq;
//		this.puntoInfDer = new Point();
//		this.puntoInfDer.sumarPunto(verticeSupIzq);
		this.alto = altura;
		this.ancho = anchura;
	}
	
//	private int alto() {
//		return Math.abs(this.puntoSupIzq.getX() - this.puntoInfDer.getX());
//	}
//	
//	private int ancho() {
//		return Math.abs(this.puntoSupIzq.getY() - this.puntoInfDer.getY());
//	}
	
	public int area() {
		return this.alto * this.ancho;
	}
	
	public int perimetro() {
		return (this.alto + this.ancho) * 2;
	}
	
	public String posicionVoH() {
		if(this.esVertical()) {
			return "el Rectangulo es vertical";
		}
		else {
			return "el Rectangulo es horizontal";
		}
	}
	
	public boolean esVertical() {
		return this.alto> this.ancho;
	}
}
