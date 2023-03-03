package br.inatel.labs;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SobreMap_1 {
	
	public static void main(String[] args) {
		Animal a1 = new Animal(1l, "Tartaruga");
		Animal a2 = new Animal(2l, "Coelho");
		Animal a3 = new Animal(3l, "Cachorro");
		Animal a4 = new Animal(4l, "Gato");
		Animal a5 = new Animal(5l, "Girafa");
		
//		Map<String, Animal> mapaDeAnimais = new HashMap<>();
		Map<String, Animal> mapaDeAnimais = new TreeMap<>();
		
		mapaDeAnimais.put("TAR", a1);
		mapaDeAnimais.put("COE", a2);
		mapaDeAnimais.put("CAC", a3);
		mapaDeAnimais.put("GAT", a4);
		mapaDeAnimais.put("GIR", a5);
		
//		System.out.println( mapaDeAnimais );
		
		Set<String> setDasChaves = mapaDeAnimais.keySet();
//		System.out.println( setDasChaves );
		
		
		
		Collection<Animal> colecaoDeValores = mapaDeAnimais.values();
//		System.out.println( colecaoDeValores );
		
		Set<Entry<String, Animal>> entrySet = mapaDeAnimais.entrySet();
		for (Entry<String, Animal> entry : entrySet) {
			System.out.println("Chave: " + entry.getKey() );
			System.out.println("Valor: " + entry.getValue() );
		}
		
	}

}
