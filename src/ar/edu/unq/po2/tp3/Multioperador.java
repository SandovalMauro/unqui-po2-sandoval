package ar.edu.unq.po2.tp3;

public class Multioperador {

	public int suma(int[] numeros) {
		
		int resultado = 0;
		
		for (int numero:numeros) {
			resultado += numero;
		}
		return resultado;
	}
	
	public int resta (int[] numeros) {
		
		int resultado = 0;
		
		for (int numero:numeros) {
			resultado-=numero;
		}
		return resultado;
	}
	
	public int multiplicacion(int[] numeros) {
		int resultado = 1;
		
		for (int numero:numeros) {
			resultado *=numero;
		}
		return resultado;
	}
}
