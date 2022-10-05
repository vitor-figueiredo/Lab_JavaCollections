package br.inatel.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class SobreCollection_2 {
	
	public static void main(String[] args) {
		
		//1
		Collection<String> engenhariasAtuais = new ArrayList<>();
		
		engenhariasAtuais.add("Telecomunicacoes");
		engenhariasAtuais.add("Biomedica");
		engenhariasAtuais.add("Computacao");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Producao");
		
		System.out.println("Engenharias atuais: " + engenhariasAtuais );
		
		
		//2
		Collection<String> engenhariasFuturas = new ArrayList<>();
		engenhariasFuturas.add("Mecanica");
		engenhariasFuturas.add("Mecatronica");
		
		System.out.println("Engenharias futuras: " + engenhariasFuturas );
		
		//3
		Collection<String> todas = new TreeSet<>();
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas as engenharias: " + todas);
		
		/////////////////////////
		
		System.out.println("");
		System.out.println(">> Entendendo isEmpty() e size()");
		
		//construtor sobrecarregado que recebe outra coleção...
		Collection<String> engenharias = new ArrayList<>(todas);
		
		System.out.println("Engenharias vazias? " + engenharias.isEmpty() );
		System.out.println("Qtos elemento engenharias tem? " + engenharias.size() );
		

		//estes 2 testes são equivalentes:
		
		if (engenharias.isEmpty()) {
			System.out.println("vazio");
		} else {
			System.out.println("tem elementos");
		}
		
		if (engenharias.size() == 0) {
			System.out.println("vazio");
		} else {
			System.out.println("tem elementos");
		}

		
		
		
		////////////////////////
		System.out.println(">> Entendendo o clear() ");
		
		imprimirStatusDaColecao(engenharias);

		System.out.println("...invocando clear()");
		engenharias.clear();
		
		imprimirStatusDaColecao(engenharias);
	}

	
	
	
	
	private static void imprimirStatusDaColecao(Collection<String> engenharias) {
		if (engenharias.isEmpty()) {
			System.out.println("vazio");
		} else {
			System.out.println("tem elementos");
		}
	}

}
