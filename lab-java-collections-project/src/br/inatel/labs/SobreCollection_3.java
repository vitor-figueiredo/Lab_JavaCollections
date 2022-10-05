package br.inatel.labs;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_3 {
	
	public static void main(String[] args) {
		
//		referenciandoColecao();
		instanciandoNovaColecao();
		
	}
	

	private static void referenciandoColecao() {
		Collection<String> frutas = new ArrayList<>();
		frutas.add("Laranja");
		frutas.add("Banana");
		frutas.add("Melancia");
		
		Collection<String> outras = frutas;
		
		System.out.println("frutas: " + frutas );
		System.out.println("outras: " + outras );
		
		System.out.println("...invocando outras.clear()");
		outras.clear();
		
		System.out.println("frutas: " + frutas );
		System.out.println("outras: " + outras );
	}

	
	private static void instanciandoNovaColecao() {
		Collection<String> frutas = new ArrayList<>();
		frutas.add("Laranja");
		frutas.add("Banana");
		frutas.add("Melancia");
		
		Collection<String> outras = new ArrayList<>(frutas);
		
		System.out.println("frutas: " + frutas );
		System.out.println("outras: " + outras );
		
		System.out.println("...invocando outras.clear()");
		outras.clear();
		
		System.out.println("frutas: " + frutas );
		System.out.println("outras: " + outras );
	}
	
	
}
