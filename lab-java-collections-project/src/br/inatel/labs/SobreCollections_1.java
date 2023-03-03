package br.inatel.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreCollections_1 {
	
	public static void main(String[] args) {
		List<String> listaDeAlimentos = new ArrayList<>();
		
		listaDeAlimentos.add("Damasco");//<
		listaDeAlimentos.add("Batata");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Cenoura");
		
		System.out.println("> Pela ordem de inserção:");
		System.out.println( listaDeAlimentos );
		
		Collections.sort( listaDeAlimentos );
		System.out.println("> Pela ordem alfabética: ");
		System.out.println( listaDeAlimentos );
	}

}
