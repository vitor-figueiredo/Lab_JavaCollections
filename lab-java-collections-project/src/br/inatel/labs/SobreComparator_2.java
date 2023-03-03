package br.inatel.labs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SobreComparator_2 {
	public static void main(String[] args) {
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add( new Animal(3L, "Tartaruga") );
		listaDeAnimais.add( new Animal(1L, "Coelho") );
		listaDeAnimais.add( new Animal(7L, "Cachorro") );
		listaDeAnimais.add( new Animal(8L, "Gato") );
		listaDeAnimais.add( new Animal(2L, "Girafa") );
		listaDeAnimais.add( new Animal(9L, "Gato") );
		
//		listaDeAnimais.sort( (a1, a2) -> a1.getNome().compareTo(a2.getNome()) );
		
//		listaDeAnimais.sort( Comparator.comparing( a -> a.getNome() ));

		listaDeAnimais.sort( Comparator.comparing( Animal::getNome ));
		System.out.println( listaDeAnimais );
		
	}

}
