package br.inatel.labs;

import java.util.HashSet;
import java.util.Set;

public class SobreSet_1 {
	
	public static void main(String[] args) {
		Set<String> setDeFrutas = new HashSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		setDeFrutas.add("Pera");
		
		System.out.println( setDeFrutas );
	}

}
