package ar.edu.unq.po2.practica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurante {
	
	private List<Plato> platos = new ArrayList<Plato>();
	
	public double sumarPlatosBaratos() {
		return getPlatos().stream().filter(p->p.precioConIvaPlato()<2000)
				.mapToDouble(p->p.precioConIvaPlato())
				.sum();
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
	
	public String platoMasCaro() {
		return platos.stream().max(Comparator.naturalOrder()).get().getNombre();
	}
}
