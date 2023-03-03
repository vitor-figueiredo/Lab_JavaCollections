package br.inatel.labs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SobreSet_2 {
	
	public static void main(String[] args) {
		Set<String> setDeFrutas = new TreeSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		setDeFrutas.add("Pera");
		
		System.out.println( setDeFrutas );
		
	}

}
