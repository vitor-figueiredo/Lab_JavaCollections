package br.inatel.labs;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class AnimalDatabaseByMap {
	
	private Map<Long, Animal> mapaDeAnimais = new HashMap<>();
	
	
	public Animal insert(Animal novoAnimal) {
		Long idGerado = gerarPKByRandom();
		
		novoAnimal.setId( idGerado );
		
		mapaDeAnimais.put(novoAnimal.getId(), novoAnimal);
		
		return novoAnimal;
	}
	
	
	public void update(Animal animal) {
		mapaDeAnimais.put(animal.getId(), animal);
	}
	
	
	public List<Animal> listAll() {
		return this.mapaDeAnimais.values().stream()
			.collect( Collectors.toList() );
	}
	
	
	public Animal findById(Long id) {
		return mapaDeAnimais.get( id );
	}

	
	public boolean delete(Long id) {
		if (mapaDeAnimais.containsKey(id)) {
			mapaDeAnimais.remove(id);
			return true;
		} else {
			return false;
		}
	}
	
	
	public List<Animal> findByNome(String fragNome) {
		if (Objects.isNull(fragNome) || fragNome.isBlank() ) {
			return Collections.emptyList();
		}
		
		return mapaDeAnimais.values().stream()
			.filter( a -> a.getNome().trim().toLowerCase().contains( fragNome.trim().toLowerCase() ) )
			.collect( Collectors.toList() );
	}

	
	
	
	
	//estrategias possiveis:
	
	
	private Long gerarPKByRandom() {
		return new Random().nextLong();
	}

	
	private static Long idGerator = 1L;
	
	private Long gerarPKByStaticAttribute() {
		return idGerator++;
	}
	
	
	private Long gerarPKBySystemNanoTime() {
		return System.nanoTime();
	}
	
	
	
	
}
