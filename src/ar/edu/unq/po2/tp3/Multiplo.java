package ar.edu.unq.po2.tp3;

public class Multiplo {

	
	public int mayorMultiploEntre(int num1, int num2) {
		int mcm = this.mcm(num1,num2);
		int valor;
		if(mcm>1000) {
			valor = -1;
		}
		else {
			valor = (1000/mcm)*mcm;
		}
		return valor;
	}
	
	private int mcm(int num1, int num2) {
		int menorNum = menorNumEntre(num1,num2);
		int mayorNum = mayorNumEntre(num1,num2);
		int resultado = mayorNum;
		
		while ((resultado%menorNum) !=0) {
			resultado+= mayorNum;
		}
		return resultado;
	}

	private int mayorNumEntre(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1>num2) {
			return num1;
		}else{
			return num2;
		}
	}

	private int menorNumEntre(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1<num2) {
			return num1;
		}else{
			return num2;
		}
	}
}
