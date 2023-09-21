package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoTemporario empleado = new EmpleadoTemporario("Mauro", "Bernal", "soltero", LocalDate.of(1956, 8, 3), 80000,  LocalDate.of(2023, 12, 1), 40);
		EmpleadoContratado empleadoC = new EmpleadoContratado("Hippie", "Bernal", "vibrando alto", LocalDate.of(1956, 8, 3), 80000, 1, "vive del aire");
		ReciboDeHaberes recibo = new ReciboDeHaberes(empleado);
		ReciboDeHaberes reciboh = new ReciboDeHaberes(empleadoC);
		//System.out.println(LocalDate.now());
		//System.out.println(empleado.getConceptos());
		//recibo.mostrar();
		//reciboh.mostrar();
		
		Empresa empresa = new Empresa();
		empresa.setCuit("30400300");
		empresa.setNombre("Burlete S.A.");
		empresa.agregarEmpleado(empleadoC);
		empresa.agregarEmpleado(empleado);
		empresa.liquidarSueldos();
		empresa.mostrarRecibos();
		System.out.println("Sueldos brutos totales: " + empresa.sueldosBrutosTotales());
		System.out.println("Sueldos netos totales: " + empresa.sueldosNetosTotales());
		System.out.println("Retenciones totales: " + empresa.retencionesTotales());
	}

}
