package ar.edu.unq.po2.tp3;

public class ExaminadorDeExpresiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String s = a;
		String t;

		System.out.println(s.length()); // la longitud de a
		//System.out.println(t.length()); excepsion por variable no inicializada
		System.out.println(1+a); // concatena el y el string de a 
		System.out.println(a.toUpperCase()); // cambia el string a mayusculas
		System.out.println("Libertad".indexOf("r"));;
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2,4));
		System.out.println((a.length() + a).startsWith("a"));
		System.out.println(s == a);
		System.out.println(a.substring(1,3).equals("bc"));

	
	}

}
