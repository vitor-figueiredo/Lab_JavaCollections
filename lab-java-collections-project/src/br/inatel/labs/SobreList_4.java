package br.inatel.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreList_4 {
	
	public static void main(String[] args) {
		
		List<String> listaDeMoveis = new ArrayList<>();
		
		listaDeMoveis.add("Cadeira");
		
		List<String> listaDeMoveisBloqueada = Collections.unmodifiableList( listaDeMoveis );
		
		boolean flagMesmaInstancia = listaDeMoveis == listaDeMoveisBloqueada;
		System.out.println("Mesma instancia? " + flagMesmaInstancia);
		
		listaDeMoveis.add("Mesa");
		
		listaDeMoveisBloqueada.add("Sofá");
		
	}

}
