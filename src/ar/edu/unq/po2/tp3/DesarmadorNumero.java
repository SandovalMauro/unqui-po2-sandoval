package ar.edu.unq.po2.tp3;

public class DesarmadorNumero {

	public int mayorDigitosPares(int [] arreglo) {
		int numero = arreglo[0];
		
		for(int entero:arreglo) {
			numero = this.numeroConMasParesEntre(numero,entero);
		}
		
		return numero;
	}

	private int numeroConMasParesEntre(int primerNum, int segundoNum) {
		// TODO Auto-generated method stub
		if(cantidadPares(primerNum)>=cantidadPares(segundoNum)) {
			return primerNum;
		}
		else {
			return segundoNum;
		}
	}

	private int cantidadPares(int numero) {
		// TODO Auto-generated method stub
		int num = numero;
		int contador = 0;
		
		while (num>0) {
			if(num%2==0) {
				contador++;
			}
			num = num/10;
		}
		return contador;
	}
}
