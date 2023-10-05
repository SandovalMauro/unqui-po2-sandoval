package ar.edu.unq.po2.practica;

import java.util.ArrayList;
import java.util.List;

public class Comparacion {

	public List<String> listaConPrefijo(List<String> listaString, String prefijo ){
		List<String> listaNueva = new ArrayList<String>();
		//for(int i=0; listaString.size()>i;i++) {
		for(String elemento: listaString) {
			//if(listaString.get(i).startsWith(prefijo)) {
			if(elemento.startsWith(prefijo)) {
				//listaNueva.add(listaString.get(i));
				listaNueva.add(elemento);
			}
		}
		
		return listaNueva;
	}
	
	public boolean algunoCumple(List<String> listaString, String prefijo) {
		boolean encontre = false;
		int i=0;
		
		while(!encontre & i<listaString.size()) {
			encontre = listaString.get(i).startsWith(prefijo);
			i++;
		}
		return encontre;
		//return listaString.stream().anyMatch(s->s.startsWith(prefijo));
	}
}
