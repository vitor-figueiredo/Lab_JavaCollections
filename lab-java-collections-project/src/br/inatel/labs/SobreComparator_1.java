package br.inatel.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1 {
	public static void main(String[] args) {
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add( new Animal(3L, "Tartaruga") );
		listaDeAnimais.add( new Animal(1L, "Coelho") );
		listaDeAnimais.add( new Animal(7L, "Cachorro") );
		listaDeAnimais.add( new Animal(8L, "Gato") );
		listaDeAnimais.add( new Animal(2L, "Girafa") );
		listaDeAnimais.add( new Animal(9L, "Gato") );
		
		System.out.println("> pela ordem do nome:");
		Collections.sort(listaDeAnimais, new ComparadorPorNome() );
		System.out.println( listaDeAnimais );
		
		System.out.println("> pela ordem do id: ");
		Collections.sort(listaDeAnimais, new ComparadorPorId() );
		System.out.println( listaDeAnimais );

	}

}
