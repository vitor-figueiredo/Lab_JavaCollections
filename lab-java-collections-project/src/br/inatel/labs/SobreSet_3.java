package br.inatel.labs;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SobreSet_3 {
	public static void main(String[] args) {
		Set<String> setDeFrutas = new LinkedHashSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		setDeFrutas.add("Pera");
		
		System.out.println( setDeFrutas );
		
	}

}
