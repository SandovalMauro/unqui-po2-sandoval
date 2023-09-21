package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	//crear atributo arraylist para numeros
	private List<Integer> numeros = new ArrayList<Integer>();
	
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	public int cantidad() {
		return this.numeros.size();
	}

	public int getEvenOcurrences() {
		// TODO Auto-generated method stub
		return (int)this.numeros.stream().filter(num -> esPar(num)).count();
	}
	
	public int getOddOcurrences() {
		// TODO Auto-generated method stub
		return (int)this.numeros.stream().filter(num -> !esPar(num)).count();
	}
	
	public int getMultiplosDe(int multiplo) {
		return (int)this.numeros.stream().filter(num -> esMultiplo(num, multiplo)).count();
	}
	
	private boolean esPar(int numero) {
		return this.esMultiplo(numero, 2);
	}

	private boolean esMultiplo(int numero, int multiplo) {
		return numero%multiplo == 0;
	}
}
